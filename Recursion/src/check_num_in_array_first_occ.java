public class check_num_in_array_first_occ {
    public static void main(String[] args) {
        int[] arr ={1,2,3,5,7,5,8};
        int tar=7;
        int si=0;
        System.out.print(search(arr,tar,si));
    }
    public static int search(int[] arr, int tar, int si){
        if(arr[si]==arr.length-1){
            return -1;
        }
        if(arr[si]==tar){
            return si;
        }
        return search(arr,tar,si+1);

    }
}
