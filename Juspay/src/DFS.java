import java.util.*;

class DFS {
    // Function to perform DFS traversal
    public void dfs(int node, List<List<Integer>> adjList, boolean[] visited) {
        // Mark the current node as visited
        visited[node] = true;
        System.out.print(node + " ");
        // Explore all the adjacent nodes of the current node
        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adjList, visited);
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

        // Reading the starting node for DFS
        System.out.print("Enter the start node for DFS: ");
        int startNode = sc.nextInt();

        // Create a visited array to track visited nodes
        boolean[] visited = new boolean[N];

        // Perform DFS
        DFS dfsSolution = new DFS();
        System.out.println("DFS Traversal:");
        dfsSolution.dfs(startNode, adjList, visited);

        sc.close();
    }
}
