package Accenture_101pages;

import java.util.HashSet;

public class _7_8_Happy_Number {
    public static int square(int n){
        int sum=0;
        while(n>0){
            int lastdigit= n%10;
            sum+=lastdigit*lastdigit;
            n=n/10;
        }
        return sum;
    }
    public static boolean ishappynumber(int n){
        HashSet<Integer> hs =new HashSet<>();
        while(n !=1 && !hs.contains(n)){
            hs.add(n);
            n= square(n);
        }
        return n==1;
    }
    public static void main(String[] args) {
        int n=19;
        if(ishappynumber(n)){
            System.out.println("Magical Number");
        }
        else{
            System.out.println("Not a magical number");
        }
    }
}

