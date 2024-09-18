import java.util.Scanner;

class Solution {
    private long largestCycle = -1;

    // Depth First Search function to detect cycles and compute their sum
    private void DFS(int node, int[] Edge, boolean[] visited, boolean[] pathVisited) {
        visited[node] = true;
        pathVisited[node] = true;

        if (Edge[node] != -1) {
            int adj = Edge[node];
            if (!visited[adj]) {
                DFS(adj, Edge, visited, pathVisited);
            } else if (pathVisited[adj]) {
                int curr = adj;
                long sum = 0;
                do {
                    sum += curr;
                    curr = Edge[curr];
                } while (curr != adj);
                largestCycle = Math.max(largestCycle, sum);
            }
        }

        pathVisited[node] = false;
    }

    // Function to find the largest sum cycle
    public long largesSumCycle(int N, int[] Edge) {
        boolean[] visited = new boolean[N];
        boolean[] pathVisited = new boolean[N];

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                DFS(i, Edge, visited, pathVisited);
            }
        }

        return largestCycle;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading the number of nodes
        System.out.print("Enter the number of nodes (N): ");
        int N = sc.nextInt();

        // Reading the edge list
        int[] Edge = new int[N];
        System.out.println("Enter the edges (-1 if no outgoing edge): ");
        for (int i = 0; i < N; i++) {
            Edge[i] = sc.nextInt();
        }

        // Creating an instance of Solution and calling the largesSumCycle function
        Solution solution = new Solution();
        long result = solution.largesSumCycle(N, Edge);

        // Printing the result
        System.out.println("The largest sum cycle is: " + result);

        sc.close();
    }
}
