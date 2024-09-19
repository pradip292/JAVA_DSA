import java.util.*;

class BFS {
    // Function to perform BFS traversal
    public void bfs(int startNode, List<List<Integer>> adjList, int N) {
        // Array to track visited nodes
        boolean[] visited = new boolean[N];

        // Queue for BFS
        Queue<Integer> queue = new LinkedList<>();

        // Start BFS from the startNode
        visited[startNode] = true;
        queue.add(startNode);

        // Perform BFS
        while (!queue.isEmpty()) {
            // Dequeue a node and print it
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");

            // Get all adjacent vertices of the dequeued node
            for (int neighbor : adjList.get(currentNode)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Scanner to read input
        Scanner sc = new Scanner(System.in);

        // Reading the number of nodes
        System.out.print("Enter the number of nodes (N): ");
        int N = sc.nextInt();

        // Reading the number of edges
        System.out.print("Enter the number of edges: ");
        int E = sc.nextInt();

        // Create an adjacency list to represent the graph
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            adjList.add(new ArrayList<>());
        }

        // Reading the edges
        System.out.println("Enter the edges (u v): ");
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt(); // Start of the edge
            int v = sc.nextInt(); // End of the edge
            adjList.get(u).add(v);
            adjList.get(v).add(u); // If it's an undirected graph
        }

        // Reading the starting node for BFS
        System.out.print("Enter the start node for BFS: ");
        int startNode = sc.nextInt();

        // Perform BFS
        BFS bfsSolution = new BFS();
        System.out.println("BFS Traversal:");
        bfsSolution.bfs(startNode, adjList, N);

        sc.close();
    }
}
