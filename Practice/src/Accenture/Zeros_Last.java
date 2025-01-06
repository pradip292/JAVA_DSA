package Accenture;

import java.util.Arrays;

public class Zeros_Last {
    public static void main(String[] args) {
        int[] ar= {1,2,0,4,0,5,4};
        int[] arr= new int[ar.length];
        Arrays.fill(arr,0);
        int index=0;
        for(int num:ar){
            if(num!=0){
                arr[index++]=num;
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
