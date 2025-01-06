package Accenture_101pages;

public class Set_bits {
    public static void main(String[] args) {
        int n= 2;
        String number= Integer.toBinaryString(n);
        System.out.println(number);
        String str="";
        for(int i=0; i<number.length(); i++){
            char ch= number.charAt(i);
            if(ch=='1'){
                str+=ch;
            }
        }
        System.out.println(str);
        int finalnum= Integer.parseInt(str);
        System.out.println(finalnum);
        int sum= Integer.parseInt(str,2);
        System.out.println(sum);
    }
}
