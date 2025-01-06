package TalentBattle;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Largest_Number_Of_Word_In_String{
    public static void main(String[] args) {
        String str= "My name is yash";
        int maxc=0;
        String finalstr="";
        String temp = "";
        int count=0;
        int maxwordcountnum=0;
        ArrayList<String> arstr= new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch ==' '){
                count=0;
                temp="";
            }
            else{
                count++;
                temp+=ch;
            }
            if(count>=maxc){
                finalstr=temp;
                maxc=count;
            }
            if(maxwordcountnum<=maxc){
                maxwordcountnum=maxc;
                arstr.add(finalstr);
            }
        }

//        System.out.println(finalstr);
        for(int i=0; i<arstr.size(); i++){
            System.out.println(arstr.get(i));
        }
        /*
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch==' '){
                temp="";
            }
            else{
                temp+=ch;
            }
            int str3= temp.length();
            if(str3>count){
                finalstr=temp;
                count=str3;
            }
        }
         */
    }
}
