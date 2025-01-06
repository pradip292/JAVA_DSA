package Accenture;

import java.util.HashSet;

public class Length_Of_Unique_Element_In_Array {
    public static void main(String[] args){
        String str= "pradip";
        int max=0;
        HashSet<Character> hs =new HashSet<>();
        for(int i=0; i<str.length();i++){
            char ch= str.charAt(i);
            if(hs.contains(ch)){
                break;
            }
            else {
                hs.add(ch);
                max++;
            }

            //max= Math.max(count,max);
        }
        System.out.println(max);

    }
}
