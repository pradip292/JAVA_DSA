import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

import static java.lang.Integer.MIN_VALUE;

public class SwapNumbersInAL {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp= list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args){
        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(1);
        list1.add(7);
        list1.add(4);
        list1.add(2);
        list1.add(6);

        System.out.println("The elements before "+ list1);
        int idx1= 1, idx2=3;
        swap(list1,idx1,idx2);
        System.out.println("The elements After "+ list1);


    }
}
