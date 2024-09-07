package MostAsked;

import java.util.HashSet;

public class SubArrayWithoutRep {
    public static void printsubarray(int[] arr, int i , int j){
        for(int k=i; k<=j; k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,2,5};
        for(int i=0; i<arr.length; i++){
            HashSet<Integer> hs = new HashSet<>();
            for(int j=i; j< arr.length; j++){
                int n= arr[j];
                if(hs.contains(n)){
                    break;
                }
                hs.add(n);
                printsubarray(arr, i, j);
            }
        }
    }
}
