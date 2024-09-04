package Accenture_101pages;

import java.util.Arrays;

public class _6_8_FirstKWords {
    public static void main(String[] args) {
        String str= "Hello my name is pradip";
        int k=3;
//        char[] ca= str.toCharArray();
        String[] sa= str.split(" ");
        for(int i=0; i<3; i++){
            if(i==k-1){
                System.out.print(sa[i]);
                break;
            }
            System.out.print(sa[i]+" ");
        }

    }
}
