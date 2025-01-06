package Accenture_101pages;

import java.math.BigInteger;

public class Add_Binary_Number_Strings {
        public static void main(String[] args) {
            String binary1 = "1101"; // Example binary string 1
            String binary2 = "1011"; // Example binary string 2

            // Call the function to add binary strings
            String result = addBinaryStrings(binary1, binary2);

            // Print the result
            System.out.println("Sum of " + binary1 + " and " + binary2 + " is: " + result);
        }

        // Function to add two binary strings using BigInteger
        public static String addBinaryStrings(String a, String b) {
            // Convert binary strings to BigInteger
            BigInteger num1 = new BigInteger(a, 2); // Base 2 for binary
            BigInteger num2 = new BigInteger(b, 2);

            // Perform addition
            BigInteger sum = num1.add(num2);

            // Convert the result back to a binary string
            return sum.toString(2); // Base 2 for binary
        }
    }


