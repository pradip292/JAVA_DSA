package Accenture;

// input - AABACC
// input - AB
// output - CC

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Substract_Char_From_String {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str1= sc.next();
        String str2= sc.next();

        StringBuilder str= new StringBuilder();
        HashSet<Character> hs = new HashSet<>();
        for(int i=0; i<str2.length();i++){
            hs.add(str2.charAt(i));
        }

        for(int j=0; j<str1.length();j++){
            if(!hs.contains(str1.charAt(j))) {
                str.append(str1.charAt(j));
            }
        }
        System.out.println(str);
    }
}
