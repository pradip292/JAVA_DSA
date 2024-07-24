package Accenture;

import java.util.HashSet;

public class countnumberofeachelementinaarray {
    public static void main(String[] args){

        int[] arr={2,1,4,5,1,6,1,1,5,1,5};
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
    }
}
