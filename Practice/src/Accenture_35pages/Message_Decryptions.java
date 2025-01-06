package Accenture_35pages;

public class Message_Decryptions {

    public static void main(String[] args) {
        // Example input string
        String msg = "1 2 3 . # 1 # 2 # 3";
        System.out.println(decryptMessage(msg));
    }

    // Main function to decrypt the message
    public static String decryptMessage(String msg) {
        if (msg == null || msg.isEmpty()) {
            return "NULL";
        }

        // Split the message by space
        String[] parts = msg.split(" ");
        StringBuilder result = new StringBuilder();

        // Loop through each part
        for (String part : parts) {
            if (isNumber(part)) {
                int num = Integer.parseInt(part);
                if (num >= 1 && num <= 26) {
                    // Convert number to corresponding letter (A-Z)
                    result.append((char) ('A' + num - 1));
                } else {
                    return "Invalid";
                }
            } else if (part.equals("_")) {
                result.append(' '); // Replace underscore with space
            } else if (!part.equals("#")) {
                result.append(part); // Add non-numeric characters
            }
        }

        // Return the final result without any '#'
        return result.toString();
    }

    // Check if a string is a number
    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

