package Accenture_101pages;

public class _22_7_X_Pattern_of_Numbers {
    public static void main(String[] args) {
        int n=9;
        for(int r=1; r<=n; r++){
            for(int c=1; c<=n; c++){
                if(r==c || r+c==n+1){
                    System.out.print(r);
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
