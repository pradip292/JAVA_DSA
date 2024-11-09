#include <iostream>
#include <vector>
#include <queue>
#include <unordered_map>
#include <mutex> // For thread safety
using namespace std;

// Structure to represent each node in the tree
struct Node {
    string value;
    vector<Node*> children;
    Node* parent;
    int anc_locked, dec_locked, userId; // For tracking locked state
    bool locked;

    // Constructor to initialize a node
    Node(string val, Node* par) {
        value = val;
        parent = par;
        anc_locked = 0; // Ancestor lock count
        dec_locked = 0; // Descendant lock count
        userId = 0;     // User ID of the locker
        locked = false; // Lock state
    }

    // Function to add children to the current node
    void addChildren(const vector<string>& childValues, Node* par) {
        for (const auto& child : childValues)
            children.push_back(new Node(child, par));
    }
};

// Function to build a tree from input data
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

// Class to handle tree operations (locking, unlocking, upgrading)
class Tree {
private:
    Node* root;
    unordered_map<string, Node*> nodeMap; // Maps node values to node pointers
    mutex mtx; // Mutex for thread safety

public:
    Tree(Node* r) { root = r; }

    Node* getRoot() { return root; }

    // Maps node values to node pointers
    void mapNodes(Node* node) {
        if (!node) return;
        nodeMap[node->value] = node;
        for (auto& child : node->children)
            mapNodes(child);
    }

    // Inform all descendants of lock changes
    void informDescendants(Node* node, int change) {
        for (auto& child : node->children) {
            child->anc_locked += change; // Update the ancestor lock count for descendants
            informDescendants(child, change);
        }
    }

    // Lock a node if conditions are met
    bool lock(string nodeName, int userId) {
        lock_guard<mutex> guard(mtx); // Lock the mutex for thread safety
        Node* targetNode = nodeMap[nodeName]; // Find the target node
        if (!targetNode) return false; // Node does not exist

        // Check if the node is already locked or has locked descendants
        if (targetNode->locked || targetNode->dec_locked > 0) {
            return false; // Cannot lock if already locked or has locked descendants
        }

        // Check all ancestors for locked state
        Node* cur = targetNode->parent;
        while (cur) {
            if (cur->locked) {
                return false; // Cannot lock if any ancestor is locked
            }
            cur = cur->parent; // Move to the next ancestor
        }

        // If all checks pass, lock the target node
        targetNode->locked = true; // Lock the node
        targetNode->userId = userId; // Set the locking user ID

        // Update the ancestor and descendant lock counts
        cur = targetNode->parent;
        while (cur) {
            cur->dec_locked++; // Increment the descendant lock count for ancestors
            cur = cur->parent; // Move up to the next ancestor
        }

        informDescendants(targetNode, 1); // Inform descendants of the lock state
        return true; // Lock successful
    }

    // Unlock a node if it's locked by the same user
    bool unlock(string nodeName, int userId) {
        lock_guard<mutex> guard(mtx); // Lock the mutex for thread safety
        Node* targetNode = nodeMap[nodeName]; // Find the target node
        if (!targetNode->locked || targetNode->userId != userId) return false; // Check if it can be unlocked

        // Update the descendant lock counts for ancestors
        Node* cur = targetNode->parent;
        while (cur) {
            cur->dec_locked--; // Decrement descendant lock count for ancestors
            cur = cur->parent; // Move up to the next ancestor
        }

        informDescendants(targetNode, -1); // Inform descendants of the unlock state
        targetNode->locked = false; // Unlock the node
        return true; // Unlock successful
    }

    // Upgrade a node by unlocking all locked descendants and locking the current node
    bool upgrade(string nodeName, int userId) {
        lock_guard<mutex> guard(mtx); // Lock the mutex for thread safety
        Node* targetNode = nodeMap[nodeName]; // Find the target node
        if (targetNode->locked || targetNode->anc_locked != 0 || targetNode->dec_locked == 0)
            return false; // Check if it can be upgraded

        // Unlock all locked descendants
        for (auto& child : targetNode->children) {
            if (child->locked && child->userId != userId) {
                unlock(child->value, child->userId); // Unlock by original user
            }
        }

        // Lock the target node
        return lock(nodeName, userId);
    }
};

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

    for (int i = 0; i < q; ++i) {
        int op, userId;
        string nodeName;
        cin >> op >> nodeName >> userId;

        switch (op) {
            case 1:
                cout << (tree.lock(nodeName, userId) ? "true" : "false") << "\n";
                break;
            case 2:
                cout << (tree.unlock(nodeName, userId) ? "true" : "false") << "\n";
                break;
            case 3:
                cout << (tree.upgrade(nodeName, userId) ? "true" : "false") << "\n";
                break;
        }
    }

    return 0;
}

