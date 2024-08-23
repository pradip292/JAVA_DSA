package Accenture_35pages;

public class LongestWordInAString {
    public static void main(String[] args) {
        String str3= "Hello my name is cristiano ronaldo suiiiiiiiiiiiii";
        String[] str1= str3.split(" ");
        int max=0;
        String str= "";
        for(int i=0; i< str1.length;i++){
            String s= str1[i];
            if(s.length()>=max) {
                max = s.length();
                str = str1[i];
            }
        }
        System.out.println(str);
        System.out.println(max);

    }
}
