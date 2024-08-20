package Accenture;

import java.util.HashSet;

public class uniquesum{
    public static int solve(int n, int[] a)
    {
        HashSet<Integer> uniqueSums = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum += a[k];
                }
                uniqueSums.add(sum);
            }
        }
        return uniqueSums.size();
    }
    public static void main(String[] args) {
    // int[] l={7,2,3,2,2};
    //int[] l={4,10,5,2,2};
        int[] l = {2, 10, 3, 4, 2};
        int n = l.length;
        System.out.println(solve(n, l));
    }
}
