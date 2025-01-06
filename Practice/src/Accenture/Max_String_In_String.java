package Accenture;

import java.util.Arrays;

public class Max_String_In_String {
    public static void main(String[] args){
        String str= "my name is pradip and i know inspired how i am i";
        String[] str1= str.split(" ");
        int max=0;
        String strress= "";
        for(int i=0; i< str1.length; i++){
            String str3= str1[i];
            int len= str3.length();
            if(len>max){
                max=len;
                strress= str3;
            }
        }
        System.out.println(max);
        System.out.println(strress);

    }
}
