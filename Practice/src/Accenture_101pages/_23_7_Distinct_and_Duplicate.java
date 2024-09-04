package Accenture_101pages;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class _23_7_Distinct_and_Duplicate {
    public static void main(String[] args){
        int[] arr= {5,4,4,9}; // output should be 10
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> d= new ArrayList<>();
        int sumd=0;
        int sumu=0;
        for(int i=0; i<arr.length; i++){
            int flag=0;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    flag=1;
                    hs.add(arr[i]);
                    break;
                }
            }
            if(flag==0 && !hs.contains(arr[i])){
                sumd+=arr[i];
            }
        }
        Iterator<Integer> it =hs.iterator();
        while(it.hasNext())
        {
            sumu+=it.next();
        }
//        for(int num : hs){
//            sumu+=num;
//        }
        System.out.println(sumd-sumu);

    }
}
