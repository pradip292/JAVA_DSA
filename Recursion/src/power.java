
public class power {
    public static void main(String[] args) {
        int a= 2;
        int n = 10;
        //System.out.println(optimizedPower(a, n));
        System.out.println(power1(a, n));
    }
    public static int optimizedPower(int a, int n){ //O(log n)
        if(n == 0) {
            return 1;
        }

        //  int halfPower = optimizedPower(a, n/2) * optimizedPower(a, n/2);   // function is calling same function repeating
        int halfPowerOptimized  = optimizedPower(a, n/2);
        int halfPower = halfPowerOptimized * halfPowerOptimized;

        if(n%2 != 0){
            return halfPower * a;
        }

        return halfPower;
    }
    public static int power1(int a, int n){
        if(n==0){
            return 1;
        }
        int fnm1= power1(a, n-1);
        int fn = a*fnm1;
        return fn;
    }


}
