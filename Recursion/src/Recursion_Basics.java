public class Recursion_Basics {
    public static void main(String[] args){
           int n=6;
           int[] arr= {1,2,3,4,5};
           System.out.print(sorted_or_not(arr,0));
           //decrease(n);
           //increase(n);
           // System.out.print(factorial(n));
            //System.out.print(sum(n));
            //System.out.print(fabo(n));
    }
    public static void decrease(int n){
        if(n==1){
            System.out.print(1);
            return ;
        }
        System.out.println(n);
        decrease(n-1);
    }

    public static void increase(int n){
        if(n==1){
            System.out.println(1);
            return ;
        }
        increase(n-1);
        System.out.println(n);

    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fnm = factorial(n-1);
        int fn = n*factorial(n-1);
        return fn;
    }

    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int sum_res= n+sum(n-1);
        return sum_res;
    }

    public static int fabo(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1= fabo(n-1);
        int fnm2= fabo(n-2);
        int fn= fnm1+fnm2;
        return fn;
    }

    public static boolean sorted_or_not(int[] arr, int i){
        if(i== arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sorted_or_not(arr, i+1);
    }


}
