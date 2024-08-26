package Accenture_35pages;
import java.util.ArrayList;

public class LongestIncreasingSubarray {

    public static void printLongestIncreasingSubarray(ArrayList<Integer> arr) {
        int n = arr.size();

        if (n == 0) {
            System.out.println("The array is empty.");
            return;
        }

        int maxLen = 1;
        int currentLen = 1;
        int startIndex = 0;

        for (int i = 1; i < n; i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                currentLen++;
            } else {
                currentLen = 1;  // Reset length for a new subarray
            }

            // Update max length and start index if needed
            if (currentLen > maxLen) {
                maxLen = currentLen;
                startIndex = i - maxLen + 1;
            }
        }

        // Print the longest increasing subarray
        System.out.print("Longest increasing subarray: ");
        for (int i = startIndex; i < startIndex + maxLen; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(4);
        arr.add(5);
        arr.add(7);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        printLongestIncreasingSubarray(arr);
    }
}
