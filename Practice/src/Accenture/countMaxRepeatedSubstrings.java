package Accenture;

public class countMaxRepeatedSubstrings {
    public static void main(String[] args){
        int maxcount=1;
        int maxres=1;
        String str= "aabbcccccaabbbbbbcc";
        for(int i=0; i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                maxcount++;
            }
            else{
                maxcount=1;
            }
            maxres= Math.max(maxcount,maxres);
        }
        System.out.println(maxres);
    }
}
