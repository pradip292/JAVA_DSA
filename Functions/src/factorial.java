import java.util.Scanner;

public class factorial {
    public static int fact_num(int n){
        int f=1;
        for(int i=1;i<=n;i++) {
            f = f * i;
        }
        return f;
    }
    public static void main( String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter the value of n");
        int a = sc.nextInt();
        System.out.println(fact_num(a));
    }
}
