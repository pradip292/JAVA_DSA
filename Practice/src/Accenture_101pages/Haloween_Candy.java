package Accenture_101pages;

import java.util.Scanner;

public class Haloween_Candy {
        public static int solve(int[] candy, int h) {
            int low = 1, high = 0;
            for (int c : candy) {
                high = Math.max(high, c); // Find the maximum candy count
            }
            while (low <= high) {
                int mid = (low + high) / 2;
                int hours = 0;

                for (int c : candy) {
                    hours += (c + mid - 1) / mid; // Calculate hours needed
                }

                if (hours > h) {
                    low = mid + 1; // Too many hours, increase rate
                } else {
                    high = mid - 1; // Valid, try for smaller rate
                }
            }

            return low; // `low` will have the minimum valid rate
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt(); // Number of candies
            int[] candy = new int[n];
            for (int i = 0; i < n; i++) {
                candy[i] = sc.nextInt();
            }
            int h = sc.nextInt(); // Maximum hours allowed

            System.out.println(solve(candy, h));
            sc.close();
        }
    }


