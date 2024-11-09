#include <iostream>
#include <vector>
#include <queue>
#include <unordered_map>
#include <mutex> 
#include <thread>
#include <chrono> // For sleep functionality
using namespace std;

// Structure to represent each node in the tree
struct Node {
    string value;
    vector<Node*> children;
    Node* parent;
    int anc_locked, dec_locked, userId;
    bool locked;

    Node(string val, Node* par) {
        value = val;
        parent = par;
        anc_locked = 0;
        dec_locked = 0;
        userId = 0;
        locked = false;
    }

    void addChildren(const vector<string>& childValues, Node* par) {
        for (const auto& child : childValues)
            children.push_back(new Node(child, par));
    }
};

Node* buildTree(Node* root, int& childrenPerNode, vector<string>& nodeNames) {
    queue<Node*> q;
    q.push(root);

    int startIndex = 1;
    while (!q.empty()) {
        Node* currentNode = q.front();
        q.pop();

        if (startIndex >= nodeNames.size()) continue;

        vector<string> childNames;
        for (int i = startIndex; i < startIndex + childrenPerNode; ++i)
            childNames.push_back(nodeNames[i]);
        currentNode->addChildren(childNames, currentNode);
        startIndex += childrenPerNode;

        for (auto& child : currentNode->children)
            q.push(child);
    }

    return root;
}

class Tree {
private:
    Node* root;
    unordered_map<string, Node*> nodeMap;
    mutex mtx;

public:
    Tree(Node* r) { root = r; }

    Node* getRoot() { return root; }

    void mapNodes(Node* node) {
        if (!node) return;
        nodeMap[node->value] = node;
        for (auto& child : node->children)
            mapNodes(child);
    }

    void informDescendants(Node* node, int change) {
        for (auto& child : node->children) {
            child->anc_locked += change;
            informDescendants(child, change);
        }
    }

    bool lock(string nodeName, int userId) {
        lock_guard<mutex> guard(mtx);
        Node* targetNode = nodeMap[nodeName];
        if (!targetNode) return false;

        if (targetNode->locked || targetNode->dec_locked > 0) {
            return false;
        }

        Node* cur = targetNode->parent;
        while (cur) {
            if (cur->locked) {
                return false;
            }
            cur = cur->parent;
        }

        targetNode->locked = true;
        targetNode->userId = userId;

        cur = targetNode->parent;
        while (cur) {
            cur->dec_locked++;
            cur = cur->parent;
        }

        informDescendants(targetNode, 1);
        return true;
    }

    bool unlock(string nodeName, int userId) {
        lock_guard<mutex> guard(mtx);
        Node* targetNode = nodeMap[nodeName];
        if (!targetNode->locked || targetNode->userId != userId) return false;

        Node* cur = targetNode->parent;
        while (cur) {
            cur->dec_locked--;
            cur = cur->parent;
        }

        informDescendants(targetNode, -1);
        targetNode->locked = false;
        return true;
    }

    bool upgrade(string nodeName, int userId) {
        lock_guard<mutex> guard(mtx);
        Node* targetNode = nodeMap[nodeName];
        if (targetNode->locked || targetNode->anc_locked != 0 || targetNode->dec_locked == 0)
            return false;

        for (auto& child : targetNode->children) {
            if (child->locked && child->userId != userId) {
                unlock(child->value, child->userId);
            }
        }

        return lock(nodeName, userId);
    }
};

// Worker function for thread operations
void performOperation(Tree& tree, int operation, const string& nodeName, int userId) {
    switch (operation) {
        case 1:
            cout << "Thread " << this_thread::get_id() << ": "
                 << (tree.lock(nodeName, userId) ? "Lock successful" : "Lock failed") << "\n";
            break;
        case 2:
            cout << "Thread " << this_thread::get_id() << ": "
                 << (tree.unlock(nodeName, userId) ? "Unlock successful" : "Unlock failed") << "\n";
            break;
        case 3:
            cout << "Thread " << this_thread::get_id() << ": "
                 << (tree.upgrade(nodeName, userId) ? "Upgrade successful" : "Upgrade failed") << "\n";
            break;
        default:
            cout << "Invalid operation\n";
            break;
    }
}

int main() {
    int n, m, q;
    cin >> n >> m >> q;

    vector<string> nodeNames(n);
    for (int i = 0; i < n; ++i)
        cin >> nodeNames[i];

    Node* root = new Node(nodeNames[0], nullptr);
    buildTree(root, m, nodeNames);

    Tree tree(root);
    tree.mapNodes(tree.getRoot());

    // Create threads for each operation
    vector<thread> threads;
    for (int i = 0; i < q; ++i) {
        int op, userId;
        string nodeName;
        cin >> op >> nodeName >> userId;
        
        // Create a thread for each operation
        threads.emplace_back(performOperation, ref(tree), op, nodeName, userId);
        // Optional: Sleep for a short duration to simulate asynchronous behavior
        this_thread::sleep_for(chrono::milliseconds(100));
    }

    // Join all threads
    for (auto& th : threads) {
        if (th.joinable()) {
            th.join();
        }
    }

    return 0;
}

