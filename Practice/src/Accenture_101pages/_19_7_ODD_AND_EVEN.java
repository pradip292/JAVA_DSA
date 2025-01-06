package Accenture_101pages;

import java.util.ArrayList;
import java.util.Collections;

public class _19_7_ODD_AND_EVEN {
    public static void main(String[] args) {
        int[] arr= {3,4,1,7,9};
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i=0; i< arr.length;i++){
            if(i%2==0){
                even.add(arr[i]);
            }
            else {
                odd.add(arr[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        System.out.println(even.toString());
        System.out.println(odd.toString());
    }
}

