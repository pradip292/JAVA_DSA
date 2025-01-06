package TalentBattle;

import java.util.Arrays;
import java.util.Scanner;

public class Max_Three_Multiplication {
    public static void main(String[] args) {
        /*
        int[] arr= {-9,-2,3,4,1};
        int n= arr.length;

        int res=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    int i1 = arr[i] * arr[j] * arr[k];
                    if(i1 >res){
                        res= i1;
                    }
                }
            }
        }
        */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        int p=arr[0]*arr[1]*arr[n-1];
        int q=arr[n-1]*arr[n-2]*arr[n-3];
        if(p>q) {
            System.out.println(p);
        }
        else {
            System.out.println(q);
        }

    }
}


// if the op for the first two element is positive one and only if they are negative
