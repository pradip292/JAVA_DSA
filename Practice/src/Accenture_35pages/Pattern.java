package Accenture_35pages;

public class Pattern {
    public static void main(String[] args) {
        int n=3;
        for(int i=n ; i>0; i--){
            for(int j=n; j>0; j--) {
                for(int k=0; k<i; k++){
                    System.out.print(j);
                }
            }
            System.out.println();
        }

    }
}

