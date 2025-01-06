package Accenture_35pages;

import javax.swing.plaf.IconUIResource;
import java.util.HashMap;

public class Permutations_Of_Cosonants {
    public static int findfactorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        String str= "abbccde";
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(ch=='A' || ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' ||ch=='a' ||ch=='i' ||ch=='o' ||ch=='e' ||ch=='u' ){
                continue;
            }
            else{
                sb.append(ch);
            }
        }
        String conso= sb.toString();
        int n = conso.length();
        if(n==0){
            System.out.println(0);;
        }
        int totalfact= findfactorial(n);

        HashMap<Character, Integer> hm= new HashMap<>();
        for(int i=0; i<n; i++){
            char ch= conso.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        for(int freq: hm.values()){
            totalfact/=findfactorial(freq);
        }
        System.out.println(totalfact);
    }
}
