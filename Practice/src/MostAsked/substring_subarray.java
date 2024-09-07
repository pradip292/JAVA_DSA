package MostAsked;

public class substring_subarray {
    public static void main(String[] args) {
        int n = 9;
        String str = "abcdefggh";
        // Iterate through the string and print all substrings of length 4
        for (int i = 0; i <= n-3; i++) {
            // Get and print the substring of length 4
            String substring = str.substring(i, i + 3);
            System.out.println(substring);
        }
    }
}
