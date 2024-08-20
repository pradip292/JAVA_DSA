package Accenture;

import java.util.Arrays;

public class _26_Rearrange_Array {
    public static void main(String[] args) {
        int[] arr = {1, 7, -5, 9, -12, 15};
        int i = 0;  // Pointer for the next negative element's position

        // Loop through the array
        for (int j = 0; j < arr.length; j++) {
            // If a negative element is found
            if (arr[j] < 0) {
                // Move the negative element to the front by swapping
                if (i != j) {
                    int temp = arr[j];
                    // Shift elements to the right to make space for the negative number
                    System.arraycopy(arr, i, arr, i + 1, j - i);
                    arr[i] = temp;
                }
                // Increment the pointer for the next negative element
                i++;
            }
        }

        // Print the rearranged array
        System.out.println(Arrays.toString(arr));
    }
}

