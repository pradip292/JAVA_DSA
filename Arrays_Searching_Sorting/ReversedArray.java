import java.util.Scanner;

public class ReversedArray {
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

        //int flag = -1; // Use -1 to indicate the element is not found initially

        int start=0;
        int end=arr.length-1;

        for(int i=0;i<n;i++){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start=start+1;
            end=end-1;
            if(start==end){
                break;
            }
            if(start>end){
                break;
            }
        }

        /*   using while loop
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
         */
        System.out.println("These are the elements in the array:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }

        sc.close();
    }
}
