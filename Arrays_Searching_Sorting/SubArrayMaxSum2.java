public class SubArrayMaxSum2 {
    public static void main(String[] args) {
        //o(n) tc
        int[] arr = {1, 2, 3, 4, 5};
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int n= arr.length;
        //System.out.println(arr.length);
        for(int i=0;i<n;i++){
            curr_sum=curr_sum+arr[i];
            if(curr_sum<0)
                curr_sum=0;

            max_sum=Math.max(curr_sum,max_sum);
            //System.out.println();
            }
        System.out.println("The max sum is "+max_sum);
    }
}
