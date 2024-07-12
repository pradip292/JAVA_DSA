import java.util.ArrayList;
import java.util.Collections;

public class TWODimensionalAL {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> list1= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        ArrayList<Integer> list3= new ArrayList<>();
        ArrayList<Integer> list4= new ArrayList<>();
//        list2.add(1); list2.add(2);
//        list1.add(list2);
//        list3.add(3); list3.add(4);
//        list1.add(list3);
//
//
//        System.out.println(list1);

        for(int i=1; i<6; i++){
            list2.add(i*2);
            list3.add(i*3);
            list4.add(i*4);
        }
        list1.add(list2);
        list1.add(list3);
        list1.add(list4);
//        list2.remove(1);
        System.out.println(list1);

        for( int i=0; i<list1.size(); i++){
            ArrayList<Integer> currlist= list1.get(i);
            for( int j=0; j<currlist.size();j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }
    }
}

