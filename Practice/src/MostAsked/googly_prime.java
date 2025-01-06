package MostAsked;

public class googly_prime { //psvm

    public static boolean calprime(int n){
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num=113;
//        if(num==0){
//            System.out.println("True");
//        }
//        if(num==1 || num ==2){
//            System.out.println("TURU");
//        }
        if(calprime(num)){
            int sum=0;
            while(num>0){
                int ld =num%10;
                sum+=ld;
                num=num/10;
            }
            if(calprime(sum)){
                System.out.println("TRUE");
            }
            else {
                System.out.println("FALSE");
            }
        }
        else {
            System.out.println("FALSE");
        }

    }
}

