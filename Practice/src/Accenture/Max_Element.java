package Accenture;

public class Max_Element {
    public static void main(String[] args){
        int[] arr ={45,8,5,45,1,9,63,4,55};
        int max=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }

}
