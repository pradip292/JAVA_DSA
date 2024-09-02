package Accenture_101pages;

public class _27_hcf
{
    public static void main(String[] args){
        int a= 675;
        int b= 835;
        int res= calhcf(a,b);
        System.out.println(res);
    }
    public static int calhcf(int a, int b){
        if(b==0){
            return a;
        }
        else {
            return calhcf(b,a%b);
        }
    }
}
