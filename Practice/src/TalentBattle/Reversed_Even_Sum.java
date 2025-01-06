package TalentBattle;

import java.util.Arrays;

public class Reversed_Even_Sum {
    public static void main(String[] args) {
        int[] ar= {1,2,3,4};
        int[] rev= new int[ar.length];
//        System.out.println(rev.length);
//        System.out.println(ar.length);
        int index=0;
        for(int i=ar.length-1; i>=0; i--){
            rev[index++]= ar[i];
//            System.out.println(rev[i]);
        }

        for(int num:rev){
            System.out.print(num+" ");
        }

        int sum=0;
        for(int i=0; i<rev.length; i++){
            if(i%2==0){
                sum+=rev[i];
            }
        }
        System.out.println(sum);

    }
}
