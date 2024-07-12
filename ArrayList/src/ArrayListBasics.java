import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args){
        ArrayList <Integer> list1 = new ArrayList<>();

        //add operation
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        System.out.println(list1);

        //get method to get the element
        System.out.println(list1.get(2));

        //remove element
        list1.remove(2);
        System.out.println(list1);

        //set element at particular index
        list1.set(2,7);
        System.out.println(list1);
        list1.add(2,3);
        System.out.println(list1);

        //contain method -> true or false
        System.out.println(list1.contains(7));

        //print size of arraylist
        System.out.println(list1.size());
    }
}
