package Accenture_101pages;

public class _21_7_FINE_NUMBER_PROBLEM {
    public static void main(String[] args) {
//        int[] arr1= {1,2,3,4,5};
//        int[] arr2 ={10,12,34,24,89};

        int[] arr1= {6,7,8,11};
        int[] arr2= {3,1,2};
        int greatest = Integer.MIN_VALUE;
        for(int i=0; i<arr1.length;i++){
            for(int j=0; j<arr2.length; j++){
                int diff= Math.abs(arr1[i]-arr2[j]);
                if(diff>=greatest){
                    greatest=diff;
                }
            }
        }
        System.out.println(greatest);

    }
}
