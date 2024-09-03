package Accenture_101pages;

public class BinaryStringCounter {
    public static int CountBinaryStrings(int n) {
        if (n == 0) return -1;
        if (n == 1) return 2;
        if (n == 2) return 3;

        int a = 1; // Number of strings of length i that end in 0
        int b = 1; // Number of strings of length i that end in 1

        for (int i = 2; i <= n; i++) {
            int new_a = a + b; // New count of strings of length i ending in 0
            int new_b = a;     // New count of strings of length i ending in 1
            a = new_a;
            b = new_b;
        }

        return a + b;
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println(CountBinaryStrings(3)); // Output: 5
        System.out.println(CountBinaryStrings(4)); // Output: 8
    }
}
