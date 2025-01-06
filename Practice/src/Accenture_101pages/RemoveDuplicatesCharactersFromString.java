package Accenture_101pages;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesCharactersFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        // Create a HashSet to store unique characters
        HashSet<Character> uniqueChars = new HashSet<>();
        StringBuilder result = new StringBuilder();

        // Loop through the input string
        for (int i=0; i<input.length(); i++) {
            char ch= input.charAt(i);
            // Add character to HashSet and check if it was added successfully
            if (uniqueChars.add(ch)) {
                result.append(ch);
            }
        }

        // Print the string with duplicates removed
        System.out.println("String after removing duplicates: " + result.toString());
    }
}

