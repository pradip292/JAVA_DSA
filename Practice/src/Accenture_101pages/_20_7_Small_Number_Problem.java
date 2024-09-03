/*
package Accenture_101pages;

import java.util.ArrayList;

public class _20_7_Small_Number_Problem {
    public static void main(String[] args){
        int[] arr= {3,2,11,11,9,5,6,3};
        ArrayList<Integer> al= new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            int flag=0;
           for(int j=i+1; j<arr.length; j++){
               if(arr[i]>arr[j]){
                   flag=1;
                   al.add(arr[j]);
                   break;
               }
           }
           if(flag==0){
               al.add(-1);
           }
        }
        System.out.println(al.toString());
    }
}

 */

package Accenture_101pages;

import java.util.ArrayList;

public class _20_7_Small_Number_Problem {
    public static void main(String[] args) {
        int[] arr = {3, 2, 11, 11, 9, 5, 6, 3};
        ArrayList<Integer> result = findNextSmallerElements(arr);
        System.out.println(result.toString());
    }

    public static ArrayList<Integer> findNextSmallerElements(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        if (arr == null || arr.length == 0) {
            return result;
        }

        // Iterate through each element of the array
        for (int i = 0; i < arr.length; i++) {
            int nextSmaller = -1;  // Default value if no smaller element is found
            // Look for the next smaller element to the right
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    nextSmaller = arr[j];
                    break;
                }
            }
            result.add(nextSmaller);
        }

        return result;
    }
}
