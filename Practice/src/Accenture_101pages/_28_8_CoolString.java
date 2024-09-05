package Accenture_101pages;//package Accenture_101pages;
//
//public class _28_8_Cool_String {
//    public static void main(String[] args) {
//        // String str= "aabbdabdccc";
//         String str= "aabbcc";
//        int removals=0;
//        StringBuilder s= new StringBuilder();
//        for(int i=0; i<str.length(); i++){
//            //char ch= str.charAt(i);
//            if(i%2!=0){
//                if(i>=1 && str.charAt(i)==str.charAt(i-1)){
//                    removals++;
//                }
//            }
//        }
//        System.out.println(removals);
//    }
//}


import java.util.Scanner;

public class _28_8_CoolString {
    public static void main(String[] args) {
        // Input the string
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();

        // Variable to count removals
        int removals = 0;

        // If the length is odd, remove one character to make it even
        if (n % 2 != 0) {
            removals++; // One character needs to be removed
            n--; // Now consider the string as having even length
        }

        // Traverse the string and check adjacent pairs
        for (int i = 0; i < n; i += 2) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                removals++; // We need to remove one character to make them equal
            }
        }

        // Output the number of removals
        System.out.println(removals);
    }
}
