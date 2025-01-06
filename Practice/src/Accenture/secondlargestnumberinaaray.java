package Accenture;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class secondlargestnumberinaaray {
    public static void main(String[] args){
        int[] arr= {1,1,1,1,1};

        int largest=0;
        int seclarge=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1]>largest){
                largest=arr[i+1];
            }
        }
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1]> seclarge && arr[i+1]!=largest){
                seclarge=arr[i+1];
            }
        }
        System.out.println(seclarge);
        System.out.println(largest);




        /*
        largest
        second largest is 7
        int n= arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);



        secondlargest method 1
        int n= arr.length;
        Arrays.sort(arr);
        System.out.println(arr[n-2]);


        //secondlargest method2
        int n= arr.length;
        for(int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                if(arr[j]>arr[i]){
                    int temp= arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.print(arr[n-2]+" ");*/
    }

}
