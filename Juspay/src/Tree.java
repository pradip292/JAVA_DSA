import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Tree {

    static class Node {
        String name;
        Node parent;
        List<Node> children;

        Node(String name) {
            this.name = name;
            this.children = new ArrayList<>();
            this.parent = null;
        }
    }

    // Use ConcurrentHashMap for thread safety and better concurrency
    static Map<String, Node> nodeMap = new ConcurrentHashMap<>();
    static Map<String, Integer> lockUser = new ConcurrentHashMap<>();
    static Map<String, Boolean> lockStatus = new ConcurrentHashMap<>();
    static Map<String, Integer> lockedDescendants = new ConcurrentHashMap<>();

    // Locks a node for the specified user ID
    static boolean lock(Node node, int uid) {
        // Check if the node or any of its ancestors are locked
        Node current = node;
        while (current != null) {
            if (lockStatus.getOrDefault(current.name, false)) {
                return false; // Node or one of its ancestors is already locked
            }
            current = current.parent;
        }
        // Lock the node
        lockStatus.put(node.name, true);
        lockUser.put(node.name, uid);
        updateAncestorDescendants(node, 1);
        return true;
    }

    // Unlocks a node if it was locked by the specified user ID
    static boolean unlock(Node node, int uid) {
        if (!lockStatus.getOrDefault(node.name, false) || !lockUser.get(node.name).equals(uid)) {
            return false; // Node is not locked or locked by a different user
        }
        // Unlock the node
        lockStatus.put(node.name, false);
        lockUser.remove(node.name);
        updateAncestorDescendants(node, -1);
        return true;
    }

    // Upgrades the lock to the ancestor node of the originally locked node
    static boolean upgradeLock(Node node, int uid) {
        // Ensure the node is not currently locked
        if (lockStatus.getOrDefault(node.name, false) && !dfsCheckDescendants(node, uid)) {
            return false;
        }
        // Unlock descendants
        dfsUnlockDescendants(node, uid);
        // Lock the new ancestor node
        return lock(node, uid);
    }

    // DFS to check if all descendants are locked by the same user
    private static boolean dfsCheckDescendants(Node node, int uid) {
        if (lockStatus.getOrDefault(node.name, false) && !lockUser.get(node.name).equals(uid)) {
            return false;
        }
        for (Node child : node.children) {
            if (!dfsCheckDescendants(child, uid)) {
                return false;
            }
        }
        return true;
    }

    // DFS to unlock all descendants
    private static void dfsUnlockDescendants(Node node, int uid) {
        if (lockStatus.getOrDefault(node.name, false) && lockUser.get(node.name).equals(uid)) {
            lockStatus.put(node.name, false);
            lockUser.remove(node.name);
        }
        for (Node child : node.children) {
            dfsUnlockDescendants(child, uid);
        }
    }

    // Updates the count of locked descendants for each ancestor node
    static void updateAncestorDescendants(Node node, int delta) {
        Node current = node;
        while (current != null) {
            int currentCount = lockedDescendants.getOrDefault(current.name, 0);
            lockedDescendants.put(current.name, currentCount + delta);
            current = current.parent;
        }
    }

    // Builds a balanced tree given the node names and max children per node
    static Node buildBalancedTree(String[] nodeNames, int maxChildren) {
        if (nodeNames.length == 0) return null;

        Node root = new Node(nodeNames[0]);
        nodeMap.put(root.name, root);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int index = 1;
        while (!queue.isEmpty() && index < nodeNames.length) {
            Node currentNode = queue.poll();
            for (int i = 0; i < maxChildren && index < nodeNames.length; i++) {
                Node child = new Node(nodeNames[index++]);
                child.parent = currentNode;
                currentNode.children.add(child);
                nodeMap.put(child.name, child);
                queue.add(child);
            }
        }
        return root;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Reading input
        System.out.print("Enter the number of nodes: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        System.out.print("Enter the maximum number of children per node: ");
        int m = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        System.out.print("Enter the number of queries: ");
        int q = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        String[] nodeNames = new String[n];
        System.out.println("Enter the node names:");
        for (int i = 0; i < n; i++) {
            nodeNames[i] = scanner.nextLine();
        }

        Node root = buildBalancedTree(nodeNames, m);

        String[] queries = new String[q];
        System.out.println("Enter the queries (OperationType NodeName UserId):");
        for (int i = 0; i < q; i++) {
            queries[i] = scanner.nextLine().trim();
        }

        // Processing queries
        for (String query : queries) {
            String[] words = query.split(" ");
            int operation = Integer.parseInt(words[0]);
            String nodeName = words[1];
            int userId = Integer.parseInt(words[2]);

            boolean result = false;
            switch (operation) {
                case 1:
                    result = lock(nodeMap.get(nodeName), userId);
                    break;
                case 2:
                    result = unlock(nodeMap.get(nodeName), userId);
                    break;
                case 3:
                    result = upgradeLock(nodeMap.get(nodeName), userId);
                    break;
            }
            System.out.print(result + " ");
        }

        scanner.close();
    }
}