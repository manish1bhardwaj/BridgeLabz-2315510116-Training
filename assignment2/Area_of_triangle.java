package assignment2;
import java.util.Scanner;

public class Area_of_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input
        
        // Taking base and height as input in centimeters
        System.out.print("Enter base (in cm): ");
        double base = sc.nextDouble();
        
        System.out.print("Enter height (in cm): ");
        double height = sc.nextDouble();
        
        // Formula: Area in square centimeters
        double area = 0.5 * base * height;
        
        // Conversion: 1 inch = 2.54 cm → 1 sq inch = (2.54 * 2.54) sq cm
        double areaSqIn = area / (2.54 * 2.54);
        
        // Display results
        System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + area);
        
        sc.close(); // Close scanner
    }
}
