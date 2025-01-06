package Accenture;

import java.util.Arrays;

public class Array_Element_Diff {
    public static void main(String[] args){
        int[] arr= {5,3,8,6};
        int j=0;
        int[] diff= new int[arr.length-1];
        for(int i=1; i<arr.length; i++){
            diff[j]= arr[i]-arr[i-1];
            j++;
        }
        System.out.println(Arrays.toString(diff));
    }

}
