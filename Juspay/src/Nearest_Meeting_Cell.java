// java
import java.util.*;
public class Nearest_Meeting_Cell {
    public static int minimumWeight(int n, int[] edges, int C1, int C2) {
//Create directed graph from the array given in input
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<Integer>());
        }
        for(int i=0;i<n;i++){
            if(edges[i]!=-1){
                graph.get(i).add(edges[i]);
            }
        }
//Create two arrays A and B for storing min distance from C1 and C2
        long[] A = new long[n];
        long[] B = new long[n];
        Arrays.fill(A,Long.MAX_VALUE);
        Arrays.fill(B,Long.MAX_VALUE);
//Part 1 and Part 2 of Algo -> Implement a dijkstra function and call it for both arrays A and B
        dijkstra(C1,graph,A);
        dijkstra(C2,graph,B);
//Now comes Part 3 part of algo-> loop through and get node with min(A[i]+B[i])
        int node=0;
        long dist=Long.MAX_VALUE;
        for(int i=0;i<n;i++){
//if node is not accessible from any of them ignore it
            if(A[i]==Long.MAX_VALUE || B[i]==Long.MAX_VALUE) continue;
// sauravhathi
            if(dist>A[i]+B[i]){
                dist= A[i]+B[i];
                node=i;
            }
        }
        if(dist==Long.MAX_VALUE) return -1; //if no meeting point is found
        return node;
    }
    private static void dijkstra(int start, List<List<Integer>> graph, long[]
            distances){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(start);
        distances[start]=0;
        while(!pq.isEmpty()){
            int curr = pq.poll();
            for(int neighbor : graph.get(curr)){
                long distance = distances[curr]+1; //all edges have same weight 1
                if(distance<distances[neighbor]){
                    distances[neighbor]=distance;
                    pq.offer(neighbor);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] edges = new int[n];
        for(int i=0;i<n;i++){
            edges[i] = scanner.nextInt();
        }
        int C1 = scanner.nextInt();
        int C2 = scanner.nextInt();
        System.out.println(minimumWeight(n,edges,C1,C2));
    }
}
