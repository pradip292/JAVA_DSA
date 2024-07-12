import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

import static java.lang.Integer.MIN_VALUE;

public class SortAL {
    public static void main(String[] args){
        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(1);
        list1.add(7);
        list1.add(4);
        list1.add(2);
        list1.add(6);

        System.out.println("The elements before "+ list1);
        Collections.sort(list1);
        System.out.println("The elements After "+ list1);
        Collections.sort(list1,Collections.reverseOrder());
        System.out.println("The elements After (Reversed) "+ list1);

    }
}
