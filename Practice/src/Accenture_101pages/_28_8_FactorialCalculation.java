package Accenture_101pages;

public class _28_8_FactorialCalculation {
    public static void main(String[] args) {
        int n=8;
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
