package Accenture;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Count_Each_Element_In_Array {
    public static void main(String[] args){

        int[] arr={2,1,4,5,1,6,1,1,5,1,5};

        HashMap<Integer, Integer> hm= new HashMap<>();
        for (int j : arr) {
            if (hm.containsKey(j)) {
                hm.put(j, hm.get(j) + 1);
            } else {
                hm.put(j, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) { // Explicitly define Map.Entry type
            System.out.println("Element: " + entry.getKey() + ", Count: " + entry.getValue());
        }

        /*
        //Using HashSet
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i< arr.length;i++)
        {
            int count=0;
            if(!hs.contains(arr[i]))
            {
                for (int j = 0; j < arr.length; j++)
                {
                    if (arr[i] == arr[j])
                    {
                        hs.add(arr[i]);
                        count++;
                    }
                }
                hs.add(arr[i]);
                System.out.println("The count of " + (arr[i]) + " is " + count);

            }
        }
         */
    }
}
