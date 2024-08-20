package Accenture;

import static java.lang.Integer.MIN_VALUE;

public class Cost_of_dishes {
    public static void main(String[] args){
        int[] arr= {80,150,50};
        int n=4;
        int max= 0;
        for(int i=0; i< arr.length;i++){
            for(int j=i+1; j< arr.length;j++){
                if(max<arr[i]+arr[j]){
                    max=arr[i]+arr[j];
                }
            }
        }
        System.out.println(max);
    }
}
