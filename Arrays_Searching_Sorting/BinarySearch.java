import java.util.Scanner;

public class BinarySearch {
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

        int start=0;
        int end= arr.length-1;
        for(int i=0;i<n;i++){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                //System.out.println("Found");
                flag=mid;
                break;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        if(flag!=-1){
            System.out.println("The element is found at "+ (flag));
        }
        else{
            System.out.println("The element is not present sorry !");
        }
        sc.close();
    }
}
