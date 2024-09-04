package Accenture_101pages;

public class Akshay_Patterns{
    public static void main(String[] args) {
    int n=6;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int min = Math.min(Math.min(i, j), Math.min(n - 1 - i, n - 1 - j));
                System.out.print(n-min);
            }
            System.out.println();
        }
    }
}
