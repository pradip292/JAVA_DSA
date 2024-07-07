import java.util.Scanner;

public class swap {
    public static void swap_num(int a, int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("Value of a is "+ a);
        System.out.println("Value of b is "+ b);
        return;
    }
    public static void main( String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter the value of A");
        int a = sc.nextInt();
        System.out.println("Please Enter the value of B");
        int b = sc.nextInt();
        swap_num(a,b);
    }
}
