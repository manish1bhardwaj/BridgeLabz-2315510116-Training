package assignment2_level1;

public class EarthVolume {
    public static void main(String[] args) {
        
        // Step 1: Radius of Earth in kilometers
        double radiusKm = 6378;
        
        // Step 2: Formula for volume of a sphere: (4/3) * π * r^3
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        
        // Step 3: 1 kilometer = 0.621371 miles → radius in miles
        double radiusMiles = radiusKm * 0.621371;
        
        // Step 4: Volume in cubic miles
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
        
        // Step 5: Display result
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 +
                           " and cubic miles is " + volumeMiles3);
    }
}
