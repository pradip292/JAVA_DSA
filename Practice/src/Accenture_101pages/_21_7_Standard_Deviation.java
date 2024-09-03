package Accenture_101pages;

import java.text.DecimalFormat;

public class _21_7_Standard_Deviation {
    public static void main(String[] args) {
        int[] arr= {10,15,17};
        int n=3;
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        int avg= sum/n;
        System.out.println(avg);
        double sd=0;
        for(int j=0;j< arr.length;j++){
            sd+= (arr[j]-avg)*(arr[j]-avg);
        }
        System.out.println(sd);
        double ans= sd/n;
        System.out.println(Math.sqrt(ans));
        DecimalFormat df= new DecimalFormat("#.00");
        System.out.println(df.format(Math.sqrt(ans)));

    }
}
