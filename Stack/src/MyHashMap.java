import  java.util.*;
public class MyHashMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] arr = {1, 1, 4, 5, 78, 9, 63, 5, 41, 2, 5, 73, 5};
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            System.out.println("Key: " + entry.getKey()+" and count is :"+ entry.getValue());
        }

    }
}
