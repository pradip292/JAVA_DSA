package Accenture_101pages;

import java.util.Scanner;

class Garage {
    int bikes;
    int cars;
    int trucks;

    // Constructor
    Garage(int bikes, int cars, int trucks) {
        this.bikes = bikes;
        this.cars = cars;
        this.trucks = trucks;
    }
}
public class _19_7_MaximumRevenueGarage {
    public static int MaxRevenue(Garage[] garages) {
        // Check if the array is null or empty
        if (garages == null || garages.length == 0) {
            return -1;
        }

        int maxRevenue = Integer.MIN_VALUE;

        // Iterate through each garage and calculate its revenue
        for (Garage garage : garages) {
            int revenue = (100 * garage.bikes) + (250 * garage.cars) + (500 * garage.trucks);
            if (revenue > maxRevenue) {
                maxRevenue = revenue;
            }
        }

        return maxRevenue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of garages: ");
        int m = sc.nextInt();

        // Initialize an array of garages
        Garage[] garages = new Garage[m];

        // Input details for each garage
        for (int i = 0; i < m; i++) {
            System.out.println("Enter the number of bikes, cars, and trucks for garage " + (i + 1) + ":");
            int bikes = sc.nextInt();
            int cars = sc.nextInt();
            int trucks = sc.nextInt();
            garages[i] = new Garage(bikes, cars, trucks);
        }

        // Calculate and print the maximum revenue
        int result = MaxRevenue(garages);
        System.out.println("Maximum revenue generated: " + result);
    }
}
