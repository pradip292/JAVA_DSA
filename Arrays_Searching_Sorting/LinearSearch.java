import java.util.Scanner;

public class LinearSearch {
    // O(n) time complexity
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your number of items in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the items in the array:");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value for index " + (i + 1) + " in the array:");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key you want to search:");
        int key = sc.nextInt();
        int flag = -1; // Use -1 to indicate the element is not found initially

        for (int p = 0; p < n; p++) {
            if (arr[p] == key) {
                flag = p;
                break; // Exit the loop once the element is found
            }
        }

        if (flag != -1) {
            System.out.println("The Element is found at position: " + (flag + 1));
        } else {
            System.out.println("The Element is not found");
        }

        sc.close();
    }
}
