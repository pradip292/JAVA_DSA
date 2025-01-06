package Accenture;

import java.util.Scanner;

public class Find_Equilibrium_Index
{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int sz = 7;
        int[] arr= new int[sz];
        int rightsum=0;
        int leftsum=0;
        int ans=-1;
        for(int i=0; i<sz; i++){
            arr[i]=sc.nextInt();
            rightsum+=arr[i];
        }
        //System.out.println(rightsum);
        for(int i=0;i<sz;i++){
            rightsum-=arr[i];
            if(leftsum==rightsum){
                ans=i;
                break;
            }
            else{
                leftsum+=arr[i];
            }
        }

        if(ans==-1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("index of equilibrium :"+ ans);
        }

    }
}
