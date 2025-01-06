package Accenture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;


public class pract {
    public static void main(String[] args) {

        char ch= 'C';
        int ch1= ch-64;
        System.out.println(ch1);
        /*
        ArrayList<Integer> ar= new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        ar.add(6);
        System.out.println(ar);
        int[] arr= new int[ar.size()];
        int index=0;
        for(int num: ar){
            arr[index++]=num;
        }
        for(int num: arr){
            System.out.print(num+" ");
        }
        /*
        String str= "Pradip";
        String finals= str.concat(" Warkhade");
        String compares= "Pradip Warkhade";


        String str1= "AB ab cc dd ee";
//        System.out.println(str1);
//        char[] cha= str1.toCharArray();

        String[] strings= str1.split(" ");
        for(String ch: strings){
            System.out.print(ch+" ");
        }
//        System.out.println(str.replace("p","x"));
//        System.out.println(finals.equals(compares));
//        System.out.println(finals);
//        System.out.println(finals.contains("w"));


         */


        /*
        StringBuilder sb = new StringBuilder();
        sb.append('p');
        sb.append('r');
        sb.append('a');
        sb.append('d');
        sb.append('i');
        sb.append('p');

        String str= String.valueOf(sb.reverse());
        System.out.println(str);
        for(int i=0; i<sb.length(); i++){
            System.out.print(sb.charAt(i));
        }
        System.out.println(sb.length());
        System.out.println(sb.toString());

        System.out.println(str.isEmpty());
         */


        /*
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

       int[] arr= new int[set.size()];
       int index=0;
       for(int num: set){
           arr[index++]=num;
       }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[2]);
        if(set.contains(20)){
            System.out.println("TRUE");
        }
        System.out.println(!set.isEmpty());
        System.out.println(set.size());
        */
    }
}

