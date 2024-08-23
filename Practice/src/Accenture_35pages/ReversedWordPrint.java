package Accenture_35pages;

import java.util.Arrays;

public class ReversedWordPrint {
    public static void main(String[] args) {
        String str = "Accenture is the best company";
        String[] str1= str.split(" ");
        for(int i=str1.length-1; i>=0; i--){
            System.out.print(str1[i]+" ");
        }

    }
}
