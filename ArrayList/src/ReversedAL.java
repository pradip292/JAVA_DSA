import java.util.*;
public class ReversedAL {
    public static void main(String[] args){
        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        for(int i=list1.size()-1; i>=0; i--){
            System.out.print(list1.get(i)+" ");
        }
    }
}
