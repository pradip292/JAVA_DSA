package Accenture_101pages;

public class _22_7_MetroCode {
    public static void main(String[] args) {
        int a= 6,b=2,c=1,d=2;
        int ordivalue= a*c;
        int div= a/b;
        int premiumvalue=div*d;
        if(a%b==0){
            System.out.println(Math.min(ordivalue,premiumvalue));
        }
        else{
            System.out.println(Math.min(ordivalue,premiumvalue)+(1*c));
        }

    }
}
