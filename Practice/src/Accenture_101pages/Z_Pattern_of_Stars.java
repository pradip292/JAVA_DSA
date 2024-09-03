package Accenture_101pages;

public class Z_Pattern_of_Stars {
    public static void main(String[] args) {
        int n=5;
        for(int r=1; r<=5; r++){
            for(int c=1; c<=5; c++){
                if(r==1 || r==n || r+c==n+1){
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
