package Accenture_101pages;

public class _26_Sum_of_Digits {
    public static void main(String[] args){
        int[] arr= {16,18,20};
        int sum1=0, sum2=0;
        int rem1, rem2;
        for(int i=0; i< arr.length; i++){
            sum1+=arr[i];
        }
        for(int i=0; i< arr.length; i++){
            int sum3=0;
            while(arr[i]>0){
                sum3+=arr[i]%10;
                arr[i]=arr[i]/10;
            }
            sum2=sum2+sum3;
        }
        rem1= sum1%10;
        rem2= sum2%10;
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(rem1);
        System.out.println(rem2);
        System.out.println(rem2-rem1);
    }
}
