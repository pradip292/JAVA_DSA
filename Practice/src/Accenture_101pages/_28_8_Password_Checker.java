package Accenture_101pages;

public class _28_8_Password_Checker {
    public static void main(String[] args) {
        String str = "abcA";
        int failedChecks = 0;

        // 1. Length Check
        if (str.length() < 6 || str.length() > 22) {
            failedChecks++;
        }

        int upperCount = 0;
        int lowerCount = 0;
        int specialCount = 0;
        int numericCount = 0;
        boolean hasConsecutive = false;

        // 2. Check for uppercase, lowercase, special characters, numeric, and consecutive characters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                upperCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                lowerCount++;
            } else if (ch >= '0' && ch <= '9') {
                numericCount++;
            } else if (ch == '@' || ch == '!' || ch == '#' || ch == '$' || ch == '%' ||
                    ch == '^' || ch == '&' || ch == '*') {
                specialCount++;
            }

            // Check for consecutive characters
            if (i > 0 && str.charAt(i) == str.charAt(i - 1)) {
                hasConsecutive = true;
            }
        }

        // 3. Uppercase check
        if (upperCount < 1) {
            failedChecks++;
        }

        // 4. Lowercase check
        if (lowerCount < 1) {
            failedChecks++;
        }

        // 5. Special character check (must be at least 2)
        if (specialCount < 2) {
            failedChecks++;
        }

        // 6. Numeric character check
        if (numericCount < 1) {
            failedChecks++;
        }

        // 7. Check for consecutive characters
        if (hasConsecutive) {
            failedChecks++;
        }

        // Output the number of failed checks
        System.out.println(failedChecks);
    }
}

