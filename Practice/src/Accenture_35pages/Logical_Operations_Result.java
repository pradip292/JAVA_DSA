package Accenture_35pages;

public class Logical_Operations_Result {
    public static void main(String[] args) {
        String str= "1C0C1C1A0B1";
//        0C1A1B1C1C1B0A0

        int res=str.charAt(0);
        for(int i=1; i<str.length()-1; i=i+2){
            char ch = str.charAt(i);
            int ch2= Integer.parseInt(String.valueOf(str.charAt(i+1)));
//            int ch2= (str.charAt(i+1)-'0');
            if(ch=='A'){
                res&=ch2;
            } else if (ch=='B') {
                res|=ch2;
            } else if (ch=='C') {
                res^=ch2;
            }
        }
        System.out.println(res);
    }
}
