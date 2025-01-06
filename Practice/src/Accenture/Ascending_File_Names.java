package Accenture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Ascending_File_Names {
    public static void main(String[] args){
        /*
        String[] arr= {"file","name","mouse"}; //fmn
//        ArrayList<Character> ca= new ArrayList<>();
        StringBuilder str= new StringBuilder();
        int m=0;
        for(int i=0; i<arr.length; i++){
            String ch = arr[m];
            char ch1= ch.charAt(0);
            str.append(ch1);
            m++;
        }
        ArrayList<Character> al = new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            al.add(ch);
        }
        Collections.sort(al);
        System.out.println(al);
        System.out.println(al.toString());

        StringBuilder strf= new StringBuilder();
        for(int i=0; i<al.size(); i++){
            strf.append(al.get(i));
        }
        System.out.println(strf);
         */


        String s = ""; // nfe
        String[] arr={"mile","leen", "zango"};
        for (int i=0; i<arr.length; i++){
            char c=arr[i].charAt(0);
            s+=c;
        }
        char[] chars = s.toCharArray();
        Arrays.sort(chars); // e,f,n
        String sortedString = new String(chars); // efn
        System.out.println(sortedString);
    }
}

