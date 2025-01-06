package Accenture_35pages;

import java.util.Arrays;
import java.util.Collections;

public class Reverse_Sort {
    public static void sortt(int start, int end, int[] arr){
        while(start<end){
            int temp= arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] ar= {4,5,6,3,7,1};
        Arrays.sort(ar);
        sortt(0,ar.length-1,ar);
        for(int num:ar){
            System.out.print(num+" ");
        }
    }
}
