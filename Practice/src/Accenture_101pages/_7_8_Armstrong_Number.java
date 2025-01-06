package Accenture_101pages;

public class _7_8_Armstrong_Number {
    public static void main(String[] args) {
        int n= 371;
        int original =n;
        int length= String.valueOf(n).length();
//        System.out.println(length);
        int sum=0;
        while(n>0){
            int lastdigit= n%10;
            sum+= (int)Math.pow(lastdigit,length);
            n=n/10;
        }
        System.out.println(sum);
        if(original==sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not");
        }
    }
}

