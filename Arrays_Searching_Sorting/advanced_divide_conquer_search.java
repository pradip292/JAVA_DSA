public class advanced_divide_conquer_search {
    public static void main(String[] args){
        int[] a = {4,5,6,7,0,1,2,3};
        int target=3; //output must be -> 4
        int tIdex= search(a,target,0,a.length-1);
        System.out.print(tIdex);

    }

    public static int search(int[] arr, int tar, int si, int ei){
        int mid= si+(ei-si)/2;
        if(si>ei) {
            return -1;
        }
        //target find on mid
        if(arr[mid]==tar){
            return mid;
        }

        //L1 line
        if(arr[si]< arr[mid]) {
            //left on l1
            if (arr[mid] >= tar && arr[si] <= tar) {
                return search(arr, tar, si, mid-1);
            } else {
                //right on l1
                return search(arr, tar, mid + 1, ei);
            }
        }
        //L2 line
        else{
            //right on l2
            if(arr[mid+1]<=tar && arr[ei]<=tar){
                return search(arr,tar,mid+1,ei);
            }
            //left of l2 ie from start to mid
            else{
                return search(arr,tar,si,mid-1);
            }
        }
    }
}

