import java.util.*;

import static java.lang.Integer.MIN_VALUE;

public class MaxElementInAL {
    public static void main(String[] args){
        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(1);
        list1.add(7);
        list1.add(4);
        list1.add(22);

        int max= MIN_VALUE;
        for(int i=0; i<list1.size();i++){
            if(max<list1.get(i)){
                max= list1.get(i);
            }
        }
        System.out.println("The max element is "+max);
    }
}
