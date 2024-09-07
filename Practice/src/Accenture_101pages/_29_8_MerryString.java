package Accenture_101pages;
import java.util.HashSet;

public class _29_8_MerryString {
    public static void main(String[] args) {
        int n=9;
        String str= "abcdefggh";
        if (n < 4)
        {
            return;
        }
        int count = 0;
        // Iterate through the string and check substrings of length 4
        for (int i = 0; i <= n - 4; i++) {
            // Get a substring of length 4
            String substring = str.substring(i, i + 4);
            System.out.println(substring);
            // Use a HashSet to check for unique characters
            HashSet<Character> set = new HashSet<>();
            // Standard for loop to iterate through characters of the substring
            for (int j = 0; j < substring.length(); j++) {
                char c = substring.charAt(j);
                set.add(c);
            }
            // If the set size is 4, all characters are unique
            if (set.size() == 4) {
                count++;
            }
        }

        // Return the count of merry substrings
        System.out.println(count);
    }
}

