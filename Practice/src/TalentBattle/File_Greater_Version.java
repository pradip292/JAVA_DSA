package TalentBattle;

public class File_Greater_Version {
    public static void main(String[] args) {
        
            String[] str = {"File_1", "File_3", "File_10", "File_7"};
            int max = 0;

            for (String s : str) {
                // Check if the string matches the pattern "File_X"
                if (s.matches("File_\\d+")) {
                    // Extract the version number after "File_"
                    int number = Integer.parseInt(s.substring(5));

                    // Update max if the current number is greater
                    if (number > max) {
                        max = number;
                    }
                }
            }

            // Print the maximum version number
            System.out.println("Maximum Version: " + max);
    }
}
