public class SubArraysInArray1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int max_sum = 0;
        int n= arr.length;
        //System.out.println(arr.length);
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                 System.out.println();
            }
            System.out.println();

        }

    }
}
