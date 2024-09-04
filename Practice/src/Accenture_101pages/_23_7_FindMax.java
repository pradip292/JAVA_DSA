package Accenture_101pages;

public class _23_7_FindMax {
    public static void main(String[] args) {
        int[] max={1,5,4,7,8,9,2,7,5,1,7,5,7,1,5,71,2};
        int maximum=0;
        int index=-1;
        for(int i=0; i<max.length;i++){
            if(max[i]>maximum){
                maximum=max[i];
                index=i;
            }
        }
        System.out.println(maximum);
        System.out.println(index);
    }
}
