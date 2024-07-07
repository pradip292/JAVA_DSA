import java.util.Scanner;

public class binomial_coeff {
    public static int fact_num(int n){
        int f=1;
        for(int i=1;i<=n;i++) {
            f = f * i;
        }
        return f;
    }
    public static int bino_coeff(int n, int r){
        int fact_n= fact_num(n);
        int fact_r= fact_num(r);
        int fact_nmr= fact_num(n-r);
        int bino = fact_n/(fact_nmr*fact_r);
        return bino;
    }
    public static void main( String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter the value of n");
        int a = sc.nextInt();
        System.out.println("Please Enter the value of r");
        int b = sc.nextInt();
        System.out.println(bino_coeff(a,b));
    }
}
