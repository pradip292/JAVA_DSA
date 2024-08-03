package Accenture;

import java.util.Arrays;
import java.util.List;

public class RotateWords {
    public static void main(String[] args) {
        String inputString = "The quick brown fox jumps over the lazy dog";
        int n = 2;

        String rotatedString = rotateWords(inputString, n);
        System.out.println(rotatedString);
    }

    public static String rotateWords(String str, int n) {
        // Split the string into words
        String[] words = str.split(" ");

        // Compute the rotation
        n = n % words.length; // To handle cases where n > len(words)

        // Rotate the list of words
        String[] rotatedWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            rotatedWords[i] = words[(i + n) % words.length];
        }

        // Join the rotated list back into a string
        return String.join(" ", rotatedWords);
    }
}
