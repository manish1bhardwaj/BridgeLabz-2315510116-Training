package assignment2_level1;

import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        
        // Step 1: Declare variables
        double heightCm, totalInches, feet, inches;
        
        // Step 2: Create Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Step 3: Take user input for height in cm
        System.out.print("Enter your height in centimeters: ");
        heightCm = input.nextDouble();
        
        // Step 4: Convert cm to total inches
        totalInches = heightCm / 2.54; // 1 inch = 2.54 cm
        
        // Step 5: Convert total inches to feet and remaining inches
        feet = Math.floor(totalInches / 12); // 1 foot = 12 inches
        inches = totalInches % 12;
        
        // Step 6: Output result
        System.out.println("Your height in cm is " + heightCm + 
                           " while in feet is " + (int)feet + 
                           " and inches is " + String.format("%.2f", inches));
        
        // Step 7: Close scanner
        input.close();
    }
}
