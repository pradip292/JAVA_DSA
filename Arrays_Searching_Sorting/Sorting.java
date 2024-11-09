import java.lang.reflect.Array;
import java.util.Arrays;
public class Sorting {
    public static void main(String[] args){
        int[] arr={4,3,2,1};
        int n= arr.length;
        //BubbleSort(arr);
        //SelectionSort(arr);
        //InsertionSort(arr);
        //Arrays.sort(arr);
        //divide(arr,0,n-1);
        quicksort(arr,0,n-1);
        PrintArr(arr);

    }
    public static void PrintArr(int[] arr){
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    //compare adjacent elements
    public static void BubbleSort(int[] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }

    //Min value find at placed at first index
    public static void SelectionSort(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp= arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }

    //take value and insert in right place using sorted and unsorted array
    public static void InsertionSort(int[] arr){
        for(int i=0;i< arr.length;i++) {
            int current = arr[i];
            int j=i-1;
            while (j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
    }

    //merge divide
    public static void divide(int[] arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        //int n= arr.length;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }
    //merge conquer
    public static void conquer(int[] arr,int si, int mid, int ei){
        int[] merged = new int[ei-si+1];
        //int si=0;
        int i=si;
        int j=mid+1;
        int k=0;
        while (i<=mid && j<=ei){
            if(arr[i]<=arr[j]){
                merged[k]=arr[i];
                i++;
            }
            else {
                merged[k]=arr[j];
                j++;

            }
            k++;
        }
        while(i<=mid){
            merged[k++]=arr[i++];
        }

        while (j<=ei){
            merged[k++]=arr[j++];
        }

        for(i=0,j=si; i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }

    //quick sorting  main
    public static void quicksort(int[] arr, int si, int ei){
        if(si<ei){
            int pidex= partition(arr,si,ei);
            quicksort(arr, si, pidex-1);
            quicksort(arr,pidex+1,ei);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
        // int pivot=arr[low];
        // int i=low;
        // int j=high;
        // while(i<j){
        //     while(arr[i]<pivot){i++;};
        //     while(arr[j]>pivot){j--;};
        //     if(i<j){
        //         swap(arr,i,j);
        //     }
        // }
        // swap(arr,low,j);
        // return j;
    }
}
