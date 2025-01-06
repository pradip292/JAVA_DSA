package Accenture_35pages;
import java.util.ArrayList;

public class Array_Union {
    public static void main(String[] args) {
        int[] arr1= {1,2,3,4,5,6};
        int[] arr2= {4,5,6,4,7,9};
        ArrayList<Integer>  inter= new ArrayList<>();
        ArrayList<Integer> union= new ArrayList<>();
        for(int i=0; i< arr1.length;i++){
            for(int j=0; j< arr2.length; j++){
                if(arr1[i]== arr2[j]){
                    union.add(arr1[i]);
                }
            }
        }
        System.out.println(union);

        for(int i=0; i<arr1.length;i++){
            inter.add(arr1[i]);
        }
        for(int i=0; i<arr2.length;i++){
            if(arr1[i]==arr2[i]){
                continue;
            }
            else{
                inter.add(arr2[i]);
            }
        }
        System.out.println(inter);
    }
}
