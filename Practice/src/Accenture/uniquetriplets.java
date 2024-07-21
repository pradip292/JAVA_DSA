package Accenture;
import java.util.Arrays;
import java.util.Scanner;
public class uniquetriplets {
    public static void main(String[] args) {
        System.out.println("Enter the Sum of triplets :");
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        System.out.println("Enter the size of an array :");
        int sz = sc.nextInt();
        int[] arr = new int[sz];
        System.out.println("Enter the elements one by one:");
        for (int i = 0; i < sz; i++) {
            System.out.println("Enter the " + (i + 1) + "Element");
            arr[i] = sc.nextInt();
        }
        // simple approach
//        int count=0;
//        for(int i=0;i<sz;i++){
//            for(int j=i+1; j<sz;j++){
//                for(int k=j; k<sz;k++){
//                    if(arr[i]*arr[j]*arr[k]==sum){
//                        count++;
//                    }
//                }
//            }
//        }
        Arrays.sort(arr);
        int count=0;
        // two pointers
        for(int i=0; i<sz-2;i++)
        {
            int curr= arr[i];
            int targetnum= sum/curr;

            int left= i+1;
            int right= sz-1;
            while(left<right)
            {
                if(arr[left]*arr[right]==targetnum){
                    count++;
                    left++;
                    right--;
                }
                else if (arr[left]*arr[right]<targetnum) {
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        System.out.println(count);
    }
}
