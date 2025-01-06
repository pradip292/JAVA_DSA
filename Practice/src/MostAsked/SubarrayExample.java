package MostAsked;

public class SubarrayExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4};
        int n = arr.length;
        // Iterate through all starting points of subarrays
        for (int start = 0; start < n; start++) {
            // Iterate through all ending points of subarrays
            for (int end = start; end < n; end++) {
                // Print subarray from 'start' to 'end'
                printSubarray(arr, start, end);
            }
        }
    }

    // Helper function to print subarray from index 'start' to 'end'
    public static void printSubarray(int[] arr, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Move to the next line after printing the subarray
    }
}

