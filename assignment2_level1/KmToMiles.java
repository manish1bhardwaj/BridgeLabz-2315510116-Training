package assignment2_level1; // Package name

public class KmToMiles {
    public static void main(String[] args) {
        
        // Step 1: Store distance in kilometers
        double kilometers = 10.8;
        
        // Step 2: Conversion factor
        double kmToMilesFactor = 1.6; // 1 km = 1.6 miles
        
        // Step 3: Convert kilometers to miles
        double miles = kilometers * kmToMilesFactor;
        
        // Step 4: Display the result
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}
