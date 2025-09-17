package assignment2_level1;

import java.util.Scanner;

public class KmTo_Miles {
    public static void main(String[] args) {
        
        // Step 1: Create a variable for kilometers
        double km;
        
        // Step 2: Create Scanner object to take input
        Scanner input = new Scanner(System.in);
        
        // Step 3: Take user input for kilometers
        System.out.print("Enter distance in kilometers: ");
        km = input.nextInt();  // taking integer input but storing in double
        
        // Step 4: Convert km to miles (1 mile = 1.6 km)
        double miles = km / 1.6;
        
        // Step 5: Display output in required format
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        
        // Step 6: Close scanner
        input.close();
    }
}
