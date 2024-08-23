package Accenture_35pages;

import java.util.Arrays;

public class Same_Char_In_A_String_Checker {
//    public static boolean strcmp(String str1, String str2) {
//        // If the lengths of the strings are not the same, they cannot be the same in terms of characters
//        if (str1.length() != str2.length()) {
//            return false;
//        }
//
//        // Create a HashMap to store the character counts of str1
//        HashMap<Character, Integer> hm = new HashMap<>();
//        for (int i = 0; i < str1.length(); i++) {
//            hm.put(str1.charAt(i), hm.getOrDefault(str1.charAt(i), 0) + 1);
//        }
//
//        // Decrement the count for characters in str2
//        for (int i = 0; i < str2.length(); i++) {
//            char key = str2.charAt(i);
//            if (!hm.containsKey(key) || hm.get(key) <= 0) {
//                return false;
//            } else {
//                hm.put(key, hm.get(key) - 1);
//            }
//        }
//
//        // If everything matched, return true
//        return true;
//    }

    public static void main(String[] args) {
        String str1 = "LISTEN";
        String str2 = "SILENT";

        char[] ar= str1.toCharArray();
//        System.out.println(ar);
        System.out.println(ar);
        for(int i=0; i<ar.length; i++) {
            System.out.print(ar[i]);
        }
        //System.out.println(strcmp(str1, str2));  // Output: true
    }

    public static boolean strcmp(String str1, String str2){
        char[] ar1 = str1.toCharArray();
        char[] ar2 = str2.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        if(ar1.length != ar2.length){
            return false;
        }
        else if(Arrays.equals(ar1, ar2)){
            return true;
        }
        return false;

    }


}