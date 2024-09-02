package Asked2025;

public class Positive_Word_Mid {
    public static int positivemid(int[] arr){
        int count =0;
        int res=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=0){
                count++;
            }
        }
        int mid = (count-1)/2;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=0){
                if(mid==0){
                    res=arr[i];
                }
                mid--;
            }

        }

        return res;
    }
    public static void main(String[] args) {
       // int[] arr={14,-45,75,-12,-23,56,99,-14};
        //int[] arr={-1,-1,-1,-1,4,-8,-9,8,3};
        int arr[] = {45, -98, 123, -254, 307, -162, 198, -67, 374, -438,
                510, -621, 432, -123, 369, -456, 247, -302, 189, -567,
                471, -307, 54, -92, 109, -437, 298, -501, 729, -378,
                64, -198, 528, -412, 275, -49, 832, -147, 501, -217,
                198, -390, 632, -127, 473, -94, 217, -361, 129, -472,
                198, -82, 394, -567, 210, -391, 817, -124, 502, -275};
        System.out.println(positivemid(arr));
    }
}
