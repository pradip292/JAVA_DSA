package Accenture;

public class findmissingnumberinaarray {
//    public static int find(int[] arr){
//        int num=-1;
//        for(int i=0; i<arr.length-1;i++){
//            num=arr[i];
//            num++;
//            if(arr[i+1]!=num){
//                return arr[i]+1;
//            }
//        }
//        return num;
//    }
//    public static void main(String[] args){
//        int[] arr={1,2,3,4,5,6,7,8,9};
//
//        System.out.println(find(arr));
//    }

    public static int find(int[] arr) {
        int n = arr.length + 1; // Since one number is missing
        int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        return totalSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,5,8,7, 9}; // Missing number is 5

        System.out.println("The missing number is: " + find(arr));
    }
}
