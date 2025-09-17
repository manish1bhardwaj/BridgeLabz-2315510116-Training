package assignment2;
import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take first number from the user
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        // Take second number from the user
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        // Calculate quotient and remainder
        int quotient = number1 / number2;  // Division
        int remainder = number1 % number2; // Modulus (remainder)

        // Display result
        System.out.println("The Quotient is " + quotient +
                           " and Remainder is " + remainder +
                           " of two numbers " + number1 + " and " + number2);

        sc.close();
    }
}
