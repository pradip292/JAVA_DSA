import java.util.*;

public class MyStringBuilderExample {

    public static String touppercase1(String str){
        StringBuilder sb= new StringBuilder();
        char ch= Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                char ch1= str.charAt(i);
                sb.append(ch1);
                i++;
                char ch2= Character.toUpperCase(str.charAt(i));
                sb.append(ch2);
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String compressed(String str){
        String str1="";
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            str1=str1+str.charAt(i);
            if(count>1){
                str1=str1+count.toString();
            }
        }
        return str1;
    }
    public static void main(String[] args){
//        StringBuilder sb= new StringBuilder("");
//        for(char i='a'; i<='z';i++){
//            sb.append(i);
//        }
//        System.out.print(sb);
//            String str="hi i am pradip";
//            System.out.print(uppercase1(str));
        String str="AAABBDDCCCCCCEE";
        System.out.print(compressed(str));

    }
}
