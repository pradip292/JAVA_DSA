public class SubArrayMaxSum1 {
    public static void main(String[] args) {
        //o(n^3) tc
        int[] arr = {1, 2, 3, 4, 5};
        int max_sum = 0;
        int curr_sum=0;
        int n= arr.length;
        //System.out.println(arr.length);
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                curr_sum=0;
                for(int k=i;k<=j;k++){
                   // System.out.print(arr[k]+" ");
                    curr_sum+=arr[k];
                }
                System.out.print(curr_sum);
                if(max_sum<curr_sum)
                {
                    max_sum=curr_sum;
                }
                System.out.println();
            }
            //System.out.println();
        }
        System.out.println("The max sum is "+max_sum);
    }
}
