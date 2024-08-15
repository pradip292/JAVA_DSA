package Accenture;

import java.util.ArrayList;

public class mergetwosortedarray {
    public static void main(String[] args){
        int[] arr1= {1,2,4,5,8,9};
        int[] arr2= {2,4,7,9,10,15,19};
        ArrayList<Integer> arrayList= new ArrayList<>();
        int i=0;
        int j=0;
        while(i< arr1.length && j< arr2.length) {
            if (arr1[i] <= arr2[j]) {
                arrayList.add(arr1[i]);
                i++;
            } else {
                arrayList.add(arr2[j]);
                j++;
            }
        }
        while (i<arr1.length) {
            arrayList.add(arr1[i]);
            i++;
        }
        while (j<arr2.length) {
            arrayList.add(arr2[j]);
            j++;
        }

        int[] res = new int[arrayList.size()];
        for(int k=0; k<arrayList.size();k++){
            res[k]=arrayList.get(k);
        }
        for(int num: res){
            System.out.print(num+" ");
        }

    }
}
