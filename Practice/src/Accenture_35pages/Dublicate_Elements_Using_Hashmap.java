package Accenture_35pages;

import java.util.HashMap;
import java.util.Map;

public class Dublicate_Elements_Using_Hashmap {
    public static void main(String[] args) {
        String str= "aabbbbbcdddeff";
        HashMap<Character, Integer> hm= new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            hm.put(ch, hm.getOrDefault(ch,0)+1);
        }
        int max=0;
        char maxcha='\0';
        for(Map.Entry<Character, Integer> entry: hm.entrySet()){

            if(entry.getValue()>max){
                maxcha =entry.getKey();
                max=entry.getValue();
//                System.out.println(entry.getKey());
//                max=max-'a'+1;
            }

        }
        System.out.println(maxcha);
    }
}
