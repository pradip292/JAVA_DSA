package Accenture_101pages;

public class _23_7_Find_Average {
    public static void main(String[] args) {
        int[] arr= {16,24,32,48,55,64,72};
        int sum=0;
        int count=0;
        for(int num : arr){
            if(num%3==0 && num%2==0){
                sum+=num;
                count++;
            }
        }
        System.out.println(sum/count);
    }
}
