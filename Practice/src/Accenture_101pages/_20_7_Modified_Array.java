package Accenture_101pages;

/*
The function accepts an integer array "arr" of size n.
Rearrange the given array in such a way that smallest element of array is the 1rst element
of array and 2nd element is the largest element of array, 2nd smallest element of array is
the 3rd element of array, 2nd largest element of the array is the 4th element of the array.
Note:
return Null if array is empty
Example:
input:
5 2 3 4 6 5 -2
output:
-2 6 2 5 3 5 4
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _20_7_Modified_Array {
    public static void main(String[] args) {
        int[] arr ={5,2,3,4,6,5,-2};
        ArrayList<Integer> ascen =new ArrayList<>();
        ArrayList<Integer> desce = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            ascen.add(arr[i]);
            desce.add(arr[i]);
        }
        Collections.sort(ascen);
        desce.sort(Collections.reverseOrder());
        ArrayList <Integer> res = new ArrayList<>();
        System.out.println("DES "+desce.toString());
        System.out.println("ASC "+ascen.toString());

        int i = 0, j = 0;
        // Alternate between smallest and largest elements until we reach the size of the original array
        while (res.size() < arr.length) {
            if (res.size() < arr.length) {
                res.add(ascen.get(i));
                i++;
            }
            if (res.size() < arr.length) {
                res.add(desce.get(j));
                j++;
            }
        }

        System.out.println(res.toString());

    }
}















