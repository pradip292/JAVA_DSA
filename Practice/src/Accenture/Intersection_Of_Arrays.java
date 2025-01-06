package Accenture;
import java.util.LinkedHashSet;

public class Intersection_Of_Arrays {
    public static void main(String[] arg){
        int[] arr2= {1,2,3,4,5,6,7,8,9};
        int[] arr1= {5,6,7,8,9,10,11,12,13};
        LinkedHashSet<Integer> hs= new LinkedHashSet<>();
        for(int i=0; i<arr1.length;i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    hs.add(arr1[i]);
                }
            }
        }
        System.out.println(hs);
    }
}
