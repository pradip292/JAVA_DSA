import java.util.Scanner;

public class hallow_reactangle {
        public static void main (String args[]){
            Scanner sc= new Scanner(System.in);
            System.out.print("Please Enter Number of rows:");
            int a = sc.nextInt();
            System.out.print("Please enter number of Colomns:");
            int b= sc.nextInt();
            //outer loop is specially for the no of rows
            int i,j;
            for(i=1; i<=a; i++){
                //inter loop is specially for no of column
                for(j=1;j<=b;j++) {
                    if(i==1 || j==1 || i==a || j==b)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }

}

