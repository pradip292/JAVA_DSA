package Accenture;

/*
1> no start with integer
2> no space or /
3> atleast one numerical value
4> atleast one capital letter
*/

import java.util.Scanner;

public class Password_Checker {
//    public static int passwordcheck(String str, int n){
//        if(n<4)
//            return 0;
//        if(str.charAt(0)>='0' && str.charAt(0)<='9')
//            return 0;
//        int cap=0,num=0;
//        for(int i=0; i<n; i++){
//            if(str.charAt(i)==' ' || str.charAt(i)=='/')
//                return 0;
//            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
//                    cap++;
//            if(str.charAt(i)>='0' && str.charAt(i)<='9')
//                    num++;
//        }
//        if(num>0 && cap>0)
//            return 1;
//        else
//            return 0;
//    }

    public static int checkPassword (String str, int n)
    {
        if (n < 4)
            return 0;
        if (str.charAt (0) >= '0' && str.charAt (0) <= '9')
            return 0;
        int num = 0, cap = 0;
        for (int i = 0; i < n; i++)
        {
            if (str.charAt (i) == ' ' || str.charAt (i) == '/')
                return 0;

            if (str.charAt (i) >= 'A' && str.charAt (i) <= 'Z')
                cap++;
            if (str.charAt (i) >= '0' && str.charAt (i) <= '9')
                num++;
        }
        if (cap > 0 && num > 0)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args){
//        System.out.println("Enter your string");
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
        String str ="asdasdAW8 aas";
        System.out.println(checkPassword(str,str.length()));
    }
}

