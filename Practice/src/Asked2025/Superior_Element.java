package Asked2025;

public class Superior_Element {
    public static void main(String[] args) {
        int[] arr = {8, 10, 6, 2, 9, 7};
        int n = arr.length;
        int count = 0;

        // Loop through each element
        for (int i = 0; i < n - 1; i++) {
            // Check if any element to the right is greater
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    count++;
                    break;  // No need to check further if we found a greater element
                }
            }
        }

        System.out.println(count);  // The count of superior elements
    }
}

