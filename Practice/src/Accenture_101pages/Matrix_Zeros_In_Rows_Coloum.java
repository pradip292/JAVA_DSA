package Accenture_101pages;

import java.util.Scanner;

public class Matrix_Zeros_In_Rows_Coloum {
    public static int detectzero(int [][] ar){
        int n= ar.length;
        for(int i=0; i<ar.length; i++){
            int flag1=1, flag2=1;
            //for rows
            for(int j=0; j<n; j++){
                if(i!=j && ar[i][j]!=0){
                    flag1=0;
                    break;
                }
            }
                // for colms
            for(int k=0; k<n; k++){
                if(i!=k && ar[k][i]!=0){
                    flag2=0;
                    break;
                }
            }
            if(flag1==1 && flag2==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns in the matrix");
        int c=sc.nextInt();
        int[][] ar= new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                ar[i][j]=sc.nextInt();
            }
        }
        System.out.println(detectzero(ar));
    }
}
