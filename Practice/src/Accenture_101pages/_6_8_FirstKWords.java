package Accenture_101pages;

import java.util.Arrays;

public class _6_8_FirstKWords {
    public static void main(String[] args) {
        String str= "Hello my name is pradip";
        int k=2;
//        char[] ca= str.toCharArray();
        String[] sa= str.split(" ");
        for(int i=0; i<k; i++)
                System.out.print(sa[i] + " ");


    }
}
