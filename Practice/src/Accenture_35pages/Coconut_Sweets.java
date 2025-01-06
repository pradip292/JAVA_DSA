package Accenture_35pages;

public class Coconut_Sweets {
    public static int calculateBoxes(int boxCapacity, int dailyConsumption, int days) {

        if (boxCapacity == 0 || dailyConsumption == 0 || days == 0) {
            return -1; // Invalid case
        }

        if (boxCapacity * 6 < dailyConsumption * 7) {
            return -1;
        }

        int totalSweetsNeeded = dailyConsumption * days;

        int totalBoxes = totalSweetsNeeded / boxCapacity;

        if (totalSweetsNeeded % boxCapacity != 0) {
            totalBoxes += 1;
        }

        return totalBoxes;
    }

    public static void main(String[] args) {
        int boxCapacity = 10; // Capacity of a single box
        int dailyConsumption = 5; // Sweets consumed daily
        int days = 7; // Total number of days

        int result = calculateBoxes(boxCapacity, dailyConsumption, days);
        System.out.println("Total boxes needed: " + result);
    }
}
