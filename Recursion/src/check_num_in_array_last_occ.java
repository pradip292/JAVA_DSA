public class check_num_in_array_last_occ {
    public static void main(String[] args) {
        int[] arr ={1,2,3,5,7,5,8};
        int tar=5;
        int si=0;
        System.out.print(search(arr,tar,si));
    }
    public static int search(int[] arr, int tar, int i){
        if(i==arr.length-1){
            return -1;
        }
        int isFound = search(arr, tar,i+1);
        if(isFound ==-1 && arr[i]==tar){
            return i;
        }
        return isFound;
    }
}
