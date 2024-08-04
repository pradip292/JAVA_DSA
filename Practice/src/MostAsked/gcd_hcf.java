package MostAsked;

public class gcd_hcf {
    public static int calculategcd(int a, int b){
        if(b==0){
            return a;
        }
        return calculategcd(b, a%b);
    }
    public static void main(String[] args){
        int a=12;
        int b=8;
        System.out.println(calculategcd(a,b));.
    }
}
