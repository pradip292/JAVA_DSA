public class ChangeArrayWhileBacktracking
{
    public static void changeArray(int[] arr, int i, int value){
        //base case
        if(i==arr.length){
            printarray(arr);
            return;
        }
        //recursion
        arr[i]= value;
        changeArray(arr,i+1,value+1);
        arr[i]=value-2;
    }
    public static void printarray(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = new int[5];
        changeArray(arr,0,1);
        printarray(arr);

    }
}
