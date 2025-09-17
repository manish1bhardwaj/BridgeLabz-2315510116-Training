package assignment2;
import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take distance in feet from user
        System.out.print("Enter the distance in feet: ");
        double distanceFeet = sc.nextDouble();

        // Conversion: 1 yard = 3 feet
        double distanceYards = distanceFeet / 3;

        // Conversion: 1 mile = 1760 yards
        double distanceMiles = distanceYards / 1760;

        // Display results
        System.out.println("The distance in yards is " + distanceYards + 
                           " while the distance in miles is " + distanceMiles);

        sc.close();
    }
}
