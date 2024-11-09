#include <iostream>
#include <vector>
#include <queue>
#include <unordered_map>
using namespace std;

// Simple Node structure with basic data types
struct Node {
    string value;
    vector<Node*> children;
    Node* parent;
    int ancestor_locked;
    int descendant_locked;
    int user_id;
    bool locked;

    Node(string val, Node* par) {
        value = val;
        parent = par;
        ancestor_locked = 0;
        descendant_locked = 0;
        user_id = 0;
        locked = false;
    }

    void add_children(vector<string>& child_values) {
        for (string& child : child_values) {
            children.push_back(new Node(child, this));
        }
    }
};

class Tree {
private:
    Node* root;
    unordered_map<string, Node*> node_map;

    // Update descendant nodes about lock status
    void update_descendants(Node* node, int change) {
        for (Node* child : node->children) {
            child->ancestor_locked += change;
            update_descendants(child, change);
        }
    }

    // Check if descendants can be unlocked
    bool check_descendants(Node* node, int user_id, vector<Node*>& locked_nodes) {
        if (node->locked) {
            if (node->user_id != user_id) {
                return false;
            }
            locked_nodes.push_back(node);
        }
        
        if (node->descendant_locked == 0) {
            return true;
        }

        for (Node* child : node->children) {
            if (!check_descendants(child, user_id, locked_nodes)) {
                return false;
            }
        }
        return true;
    }

public:
    Tree(Node* r) {
        root = r;
    }

    void build_node_map(Node* node) {
        if (!node) return;
        node_map[node->value] = node;
        for (Node* child : node->children) {
            build_node_map(child);
        }
    }

    bool lock(string node_name, int user_id) {
        Node* target = node_map[node_name];
        
        // Check if node can be locked
        if (target->locked || target->ancestor_locked || target->descendant_locked) {
            return false;
        }

        // Update ancestor counts
        Node* current = target->parent;
        while (current) {
            current->descendant_locked++;
            current = current->parent;
        }
        
        // Update descendant states
        update_descendants(target, 1);
        
        // Lock the node
        target->locked = true;
        target->user_id = user_id;
        return true;
    }

    bool unlock(string node_name, int user_id) {
        Node* target = node_map[node_name];
        
        // Check if node can be unlocked
        if (!target->locked || target->user_id != user_id) {
            return false;
        }

        // Update ancestor counts
        Node* current = target->parent;
        while (current) {
            current->descendant_locked--;
            current = current->parent;
        }
        
        // Update descendant states
        update_descendants(target, -1);
        
        // Unlock the node
        target->locked = false;
        return true;
    }

    bool upgrade(string node_name, int user_id) {
        Node* target = node_map[node_name];
        
        // Check if upgrade is possible
        if (target->locked || target->ancestor_locked || !target->descendant_locked) {
            return false;
        }

        vector<Node*> locked_descendants;
        if (!check_descendants(target, user_id, locked_descendants)) {
            return false;
        }

        // Unlock all descendants
        for (Node* node : locked_descendants) {
            unlock(node->value, user_id);
        }
        
        // Lock the current node
        return lock(node_name, user_id);
    }
};

int main() {
    int n, m, q;
    cin >> n >> m >> q;

    vector<string> node_names(n);
    for (int i = 0; i < n; i++) {
        cin >> node_names[i];
    }

    // Build tree
    Node* root = new Node(node_names[0], nullptr);
    queue<Node*> build_queue;
    build_queue.push(root);

    int index = 1;
    while (!build_queue.empty() && index < n) {
        Node* current = build_queue.front();
        build_queue.pop();

        vector<string> child_names;
        for (int i = 0; i < m && index + i < n; i++) {
            child_names.push_back(node_names[index + i]);
        }
        
        if (!child_names.empty()) {
            current->add_children(child_names);
            for (Node* child : current->children) {
                build_queue.push(child);
            }
        }
        index += m;
    }

    // Initialize tree and build node map
    Tree tree(root);
    tree.build_node_map(root);

    // Process queries
    for (int i = 0; i < q; i++) {
        int operation, user_id;
        string node_name;
        cin >> operation >> node_name >> user_id;

        bool result = false;
        if (operation == 1) {
            result = tree.lock(node_name, user_id);
        } else if (operation == 2) {
            result = tree.unlock(node_name, user_id);
        } else if (operation == 3) {
            result = tree.upgrade(node_name, user_id);
        }
        
        cout << (result ? "true" : "false") << endl;
    }
    return 0;
}
