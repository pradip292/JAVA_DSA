package Accenture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SortedArraysAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int sz = sc.nextInt();
        int[] arr = new int[sz];
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        System.out.println("Enter elements");
        for(int i=0; i<sz; i++){
            arr[i]=sc.nextInt();
        }
        for(int p=0; p<sz; p++){
            if (p%2==0) {
                even.add(arr[p]);
            }
            else
                odd.add(arr[p]);
        }
        Collections.sort(even);
        Collections.sort(odd);
        System.out.println(even);
        System.out.println(odd);
        int se= even.get(even.size()-2);
        int so = odd.get(odd.size()-2);
        System.out.print("Addition of second max value of each sorted array is"+(se+so));

    }
}
