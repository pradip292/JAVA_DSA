package Accenture;

public class StringtoInteger {
    public static void main(String[] args){
        String str= "1122";
        int num= Integer.parseInt(str);
        System.out.println(num);

        int num1= 266;
        String str1= String.valueOf(num1);
        System.out.println(str1);

        float num2= 25.65f;
        System.out.println(Math.ceil(num2));
        System.out.println(Math.floor(num2));
        System.out.println(Math.round(num2));


    }
}
