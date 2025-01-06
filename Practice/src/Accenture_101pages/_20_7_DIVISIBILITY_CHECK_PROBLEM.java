package Accenture_101pages;

public class _20_7_DIVISIBILITY_CHECK_PROBLEM {
    public static void main(String[] args) {
        int n1= 71;
        int n2= 8;
        if(n1%n2==0){
           System.out.println(n1);
           return;
        }
        int res1= n1/n2;
//        System.out.println(res1);
        int diff1st= n1-(res1*n2);
//        System.out.println(diff1st);
        int res2= (res1*n2)+n2;
        int diff2nd= res2-n1;
        int res= Math.min(diff2nd,diff1st);
        if(res==diff1st){
            System.out.println(res1*n2);
        }
        else {
            System.out.println(res2);
        }
    }
}

