package Accenture_35pages;

public class A_Pattern_Of_Stars {
    public static void main(String[] args){
        int n=6;
        int a= (n/2);
        for(int r=1; r<=n; r++){
            for(int c=1; c<=n; c++){
                if(r==1 || c==1 || c==n || r==a)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
