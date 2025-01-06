package Accenture_101pages;

public class X_Pattern_of_starts {
    public static void main(String[] args) {
        int n=4;
        for(int r=1; r<=n; r++){
            for(int c=1; c<=n; c++){
                if(r==c || r+c==n+1){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

