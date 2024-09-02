package Accenture_101pages;

public class _29_RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        String str = "abciijklma";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            // If current character is not the same as the next character, add it to the result
            if (i == str.length() - 1 || str.charAt(i) != str.charAt(i + 1)) {
                result.append(str.charAt(i));
            } else {
                // Skip all consecutive duplicates
                while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                    i++;
                }
            }
        }

        System.out.println("Output: " + result.toString());
    }
}
