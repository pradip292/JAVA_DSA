package MostAsked;

public class pallindromestring {
    public static boolean ispallindrome(String str){
        int n= str.length();
        for(int i=0; i<str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt(n-i-1)){
               return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String str= "prrp";
        System.out.println(ispallindrome(str));
    }
}
