import java.util.Scanner;

public class BinarySearch {
    // O(n) time complexity
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Enter the elements in incresing order");
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element that u have to search: ");
        int t= sc.nextInt();
        int start=0;
        int last= arr.length-1;
        int flag=-1;
    
        for(int i=0; i<n; i++){
            int mid = (start+last)/2;
            if(arr[mid]==t){
                flag=mid;
                break;
            }
            else if(arr[mid]<t){
                start=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        if(flag!=-1){
            System.out.println("Element found at index "+flag);
        }
        else{
            System.out.println("Element not found");
        }

    }
}
