package Accenture_35pages;

public class Encoding_Square_Of_Numbers{
    public static void main(String[] args) {
        int n= 34;
        String str= String.valueOf(n);
//        System.out.println(str);
        String res="";
        for(int i=0; i<str.length(); i++){
            int ch = str.charAt(i)-'0';
            int sq= ch*ch;
            res+=sq;
        }
        System.out.println(res);
    }
}
