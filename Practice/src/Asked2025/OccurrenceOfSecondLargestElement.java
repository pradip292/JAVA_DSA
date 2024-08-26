package Asked2025;

import java.util.ArrayList;
import java.util.Arrays;

public class OccurrenceOfSecondLargestElement {

    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 4,4,4,4 , 5, 5, 5, 5};

        // Sort the array
        Arrays.sort(ar);

        // Get the second largest unique element
        int largest = ar[ar.length - 1];
        int secondLargest = -1;

        // Traverse from the end to find the second largest unique element
        for (int i = ar.length-1 ; i >= 0; i--) {
            if (ar[i] < largest) {
                secondLargest = ar[i];
                break;
            }
        }

        if (secondLargest == -1) {
            System.out.println("There is no second largest element.");
            return;
        }

        // Count the occurrence of the second largest element
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == secondLargest) {
                count++;
            }
        }

        System.out.println("Second largest element: " + secondLargest);
        System.out.println("Occurrence of second largest element: " + count);
    }
}
