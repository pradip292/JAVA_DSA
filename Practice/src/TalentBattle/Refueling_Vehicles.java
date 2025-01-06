package TalentBattle;

import java.util.Arrays;
import java.util.Collections;

public class Refueling_Vehicles {
    public static void main(String[] args) {
        int a=100;
        int y= 6;
        int rf=0;
        Integer[] arr={90,120,110,105,80,70};
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<a){
                arr[i]=arr[i]+a;
                rf++;
                int min= arr[i]-a;
                arr[i+1]=arr[i+1]+min;
            }
        }
        System.out.println(rf);
    }
}

