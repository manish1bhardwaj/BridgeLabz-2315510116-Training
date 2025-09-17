package assignment2;  // Declares that this class belongs to the package "assignment2"
import java.util.*;    // Imports all utility classes (like Scanner) from the java.util package

public class Basic_Calculator {  // Declares a public class named Basic_Calculator

    // Method to add two numbers
    public static double add(double num1, double num2) {
        return num1 + num2; // Returns the sum of num1 and num2
    }

    // Method to subtract two numbers
    public static double sub(double num1, double num2) {
        return num1 - num2; // Returns the result of num1 minus num2
    }

    // Method to multiply two numbers
    public static double mul(double num1, double num2) {
        return num1 * num2; // Returns the product of num1 and num2
    }

    // Method to divide two numbers
    public static double div(double num1, double num2) {
        return num1 / num2; // Returns the result of num1 divided by num2
    }

    // Main method - program execution starts here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creates a Scanner object to read user input from the keyboard

        System.out.print("Enter first number: "); // Prompt message for first number
        double num1 = sc.nextDouble(); // Reads the first number entered by the user

        System.out.print("Enter second number: "); // Prompt message for second number
        double num2 = sc.nextDouble(); // Reads the second number entered by the user

        // Perform and display the results using user-entered numbers
        System.out.println(add(num1, num2));  // Prints the result of addition
        System.out.println(sub(num1, num2));  // Prints the result of subtraction
        System.out.println(mul(num1, num2));  // Prints the result of multiplication
        System.out.println(div(num1, num2));  // Prints the result of division

        sc.close(); // Closes the Scanner object to release resources
    }
}
