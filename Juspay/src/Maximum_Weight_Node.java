import java.util.Scanner;

class Solution1 {
    public int maxWeightCell(int N, int[] Edge) {
        int[] weights = new int[N];

        // Calculate the weights for each node
        for (int i = 0; i < N; i++) {
            if (Edge[i] != -1) {
                weights[Edge[i]] += i;
            }
        }

        int maxWeight = -1;
        int maxWeightCell = -1;

        // Find the cell with the maximum weight
        for (int i = 0; i < N; i++) {
            if (weights[i] > maxWeight || (weights[i] == maxWeight && i > maxWeightCell)) {
                maxWeight = weights[i];
                maxWeightCell = i;
            }
        }

        return maxWeightCell;
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

        // Creating an instance of Solution and calling the maxWeightCell function
        Solution1 solution = new Solution1();
        int result = solution.maxWeightCell(N, Edge);

        // Printing the result
        System.out.println("The cell with the maximum weight is: " + result);

        sc.close();
    }
}
