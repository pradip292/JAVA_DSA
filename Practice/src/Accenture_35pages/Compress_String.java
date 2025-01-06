package Accenture_35pages;

public class Compress_String {
    public static void main(String[] args) {
        String str= "aaabbbbccc";
        String ans="";
        int count =1;
        for(int i=0; i<str.length()-1; i++){
            char ch= str.charAt(i);
            char ch2= str.charAt(i+1);
            if(ch==ch2){
                count++;
            }
            else{
                ans+=ch;
                //System.out.println(ans);
                ans+=Integer.toString(count);
                count=1;
            }
        }
        ans += str.charAt(str.length() - 1);
        ans += Integer.toString(count);
        System.out.println(ans);
    }
}
