#include <iostream>
#include <vector>
#include <queue>
#include <unordered_map>
using namespace std;

// Structure to represent each node in the tree
struct Node {
    
    string value;
    vector<Node*> children;
    Node* parent;
    int anc_locked, dec_locked, userId;
    bool locked;

    // Constructor to initialize a node
    Node(string val, Node* par) {
        value = val;
        parent = par;
        anc_locked = 0; // Keeps track of locked ancestors
        dec_locked = 0; // Keeps track of locked descendants
        userId = 0;
        locked = false;
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
    unordered_map<string, Node*> nodeMap;

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

    // Verify if descendants can be unlocked (check user id and locked state)
    bool verifyDescendants(Node* node, int& userId, vector<Node*>& lockedDescendants) {
        if (node->locked) {
            if (node->userId != userId) return false; // If another user locked it
            lockedDescendants.push_back(node);
        }
        if (node->dec_locked == 0) return true;

        bool result = true;
        for (auto& child : node->children) {
            result &= verifyDescendants(child, userId, lockedDescendants);
            if (!result) return false;
        }
        return result;
    }

    // Lock a node if conditions are met
    bool lock(string nodeName, int userId) {
        Node* targetNode = nodeMap[nodeName];
        if (targetNode->locked || targetNode->anc_locked != 0 || targetNode->dec_locked != 0)
            return false;

        Node* cur = targetNode->parent;
        while (cur) {
            cur->dec_locked++; // Increment descendant lock count for ancestors
            cur = cur->parent;
        }
        informDescendants(targetNode, 1); // Inform descendants of lock state
        targetNode->locked = true;
        targetNode->userId = userId;
        return true;
    }

    // Unlock a node if it's locked by the same user
    bool unlock(string nodeName, int userId) {
        Node* targetNode = nodeMap[nodeName];
        if (!targetNode->locked || targetNode->userId != userId)
            return false;

        Node* cur = targetNode->parent;
        while (cur) {
            cur->dec_locked--; // Decrement descendant lock count for ancestors
            cur = cur->parent;
        }
        informDescendants(targetNode, -1); // Inform descendants of unlock state
        targetNode->locked = false;
        return true;
    }

    // Upgrade a node by unlocking all locked descendants and locking the current node
    bool upgrade(string nodeName, int userId) {
        Node* targetNode = nodeMap[nodeName];
        if (targetNode->locked || targetNode->anc_locked != 0 || targetNode->dec_locked == 0)
            return false;

        vector<Node*> lockedDescendants;
        if (verifyDescendants(targetNode, userId, lockedDescendants)) {
            for (auto& lockedNode : lockedDescendants)
                unlock(lockedNode->value, userId);
        } else {
            return false;
        }
        lock(nodeName, userId);
        return true;
    }
};

int main() {
    int n, m, q;
    cin >> n >> m >> q;

    vector<string> nodeNames(n);
    for (int i = 0; i < n; ++i)
        cin >> nodeNames[i];

    Node* root = new Node(nodeNames[0], nullptr);
    root = buildTree(root, m, nodeNames);

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