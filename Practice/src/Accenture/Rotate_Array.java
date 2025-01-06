package Accenture;

public class Rotate_Array {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5}; // Input array
        int k = 4; // Number of positions to rotate
        int n = ar.length; // Length of the array

        // Handle cases where k >= n
        int m = k % n;

        // Create a new array for the rotated result
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ar[(i + (n - m)) % n];
        }

        // Print the rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
