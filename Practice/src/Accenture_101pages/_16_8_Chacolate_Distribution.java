package Accenture_101pages;

public class _16_8_Chacolate_Distribution {
    public static void main(String[] args) {
        int n=5;
        int count=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i>j && j>=1 && i+j==n){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

/*
package Accenture_101pages;

public class _16_8_Chocolate_Distribution {
    public static void main(String[] args) {
        int n = 5;  // Example input
        int count = 0;

        // Iterate over possible values for j
        for (int j = 1; j < n; j++) {
            int i = n - j;  // Calculate A's chocolates

            // A must get more chocolates than B
            if (i > j) {
                count++;
            }
        }

        System.out.println(count);  // Output the number of valid distributions
    }
}

 */