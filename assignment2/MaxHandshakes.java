package assignment2;

import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        
        // Step 1: Declare variables
        int numberOfStudents;
        int maxHandshakes;
        
        // Step 2: Create Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Step 3: Get number of students from user
        System.out.print("Enter the number of students: ");
        numberOfStudents = input.nextInt();
        
        // Step 4: Apply formula for maximum handshakes
        // Formula: (n * (n - 1)) / 2
        maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        // Step 5: Display result
        System.out.println("The maximum number of possible handshakes is: " + maxHandshakes);
        
        // Step 6: Close scanner
        input.close();
    }
}
