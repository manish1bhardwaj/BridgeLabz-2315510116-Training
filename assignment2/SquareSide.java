package assignment2;
import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object to read input
        
        // Take perimeter input from the user
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();
        
        // Formula: Perimeter of a square = 4 × side
        double side = perimeter / 4;
        
        // Display result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        sc.close(); // Close scanner to avoid resource leaks
    }
}
