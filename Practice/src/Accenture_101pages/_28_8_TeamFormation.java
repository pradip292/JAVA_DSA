package Accenture_101pages;

public class _28_8_TeamFormation {
    public static void main(String[] args) {
        int fresher = 5;
        int experienced = 5;
        int count = 0; // This variable keeps track of the number of teams formed.

        // Loop runs while there are enough freshers and experienced candidates to form a team.
        while ((fresher >= 3 && experienced >= 1) || (experienced >= 3 && fresher >= 1)) {

            // If there are more freshers than experienced candidates,
            // form a team using 3 freshers and 1 experienced candidate.
            if (fresher > experienced) {
                fresher = fresher - 3;
                experienced--;
                count++; // Increment the count of teams formed.
            }
            // Otherwise, form a team using 3 experienced candidates and 1 fresher.
            else {
                experienced = experienced - 3;
                fresher--;
                count++; // Increment the count of teams formed.
            }
        }
        System.out.println(count);
        // Return the total number of teams formed.
    }
}
