import java.util.*;

class Dijkstra {
    // Helper class to represent a node and its distance
    static class Node implements Comparable<Node> {
        int vertex, weight;

        Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }

        // This is used for priority queue ordering (min-heap based on distance)
        public int compareTo(Node other) {
            return this.weight - other.weight;
        }
    }

    // Function to perform Dijkstra's algorithm from the given start node
    public void dijkstra(int start, List<List<Node>> adjList, int N) {
        // Create an array to store the shortest distances, initialized to infinity
        int[] dist = new int[N];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        // Priority queue to select the next node with the smallest distance
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));

        // Perform Dijkstra's algorithm
        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int u = current.vertex;

            // Traverse all adjacent vertices of u
            for (Node neighbor : adjList.get(u)) {
                int v = neighbor.vertex;
                int weight = neighbor.weight;

                // Relaxation step: if a shorter path is found, update it
                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.add(new Node(v, dist[v]));
                }
            }
        }

        // Print the shortest distances from the start node to all other nodes
        System.out.println("Shortest distances from node " + start + ":");
        for (int i = 0; i < N; i++) {
            System.out.println("To node " + i + " -> " + dist[i]);
        }
    }

    public static void main(String[] args) {
        // Scanner to read input
        Scanner sc = new Scanner(System.in);

        // Reading the number of nodes and edges
        System.out.print("Enter the number of nodes (N): ");
        int N = sc.nextInt();
        System.out.print("Enter the number of edges: ");
        int E = sc.nextInt();

        // Create an adjacency list to represent the graph
        List<List<Node>> adjList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            adjList.add(new ArrayList<>());
        }

        // Reading the edges and their weights
        System.out.println("Enter the edges (u v w) with weight w: ");
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt(); // Start of the edge
            int v = sc.nextInt(); // End of the edge
            int w = sc.nextInt(); // Weight of the edge
            adjList.get(u).add(new Node(v, w)); // Directed graph
            adjList.get(v).add(new Node(u, w)); // Add this line if the graph is undirected
        }

        // Reading the start node for Dijkstra's algorithm
        System.out.print("Enter the start node for Dijkstra: ");
        int start = sc.nextInt();

        // Perform Dijkstra's algorithm
        Dijkstra dijkstraSolution = new Dijkstra();
        dijkstraSolution.dijkstra(start, adjList, N);

        sc.close();
    }
}
