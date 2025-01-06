package Accenture;

import java.util.ArrayList;
import java.util.HashSet;

public class removedublicatesinaarray {
    public static int[] finddublicate(int[] arr){
        HashSet<Integer> uniqueset =new HashSet<>();
        ArrayList<Integer> resultlist = new ArrayList<>();
        for(int i=0; i<arr.length;i++){
            if(uniqueset.add(arr[i])){
                resultlist.add(arr[i]);
            }
        }

        // Convert the ArrayList to an array
        int[] res = new int[resultlist.size()];
        for(int num=0; num<resultlist.size() ;num++){
            res[num]=resultlist.get(num);
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr = {2,1,3,5,4,5,1,7,2,4,9};
        int[] res1 = finddublicate(arr);
        for(int i=0;i< res1.length;i++){
            System.out.print(res1[i]+" ");
        }

    }
}
