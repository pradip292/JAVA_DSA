package Accenture;

public class MIssing_number {
    public static void main(String[] args){
        int[] arr= {3,4,7,8,2,1,5};
        int n= 8;
        int sum_of_n= n*(n+1)/2;
        int sum=0;
        for(int i=0 ; i< arr.length;i++){
            sum+=arr[i];
        }
        int diff= sum_of_n-sum;

        System.out.println(diff);
    }
}
