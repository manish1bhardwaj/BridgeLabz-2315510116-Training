package assignment2;
import java.util.Scanner;

public class Purchase_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take unit price from the user
        System.out.print("Enter the unit price (INR): ");
        double unitPrice = sc.nextDouble();

        // Take quantity from the user
        System.out.print("Enter the quantity: ");
        int quantity = sc.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Display result
        System.out.println("The total purchase price is INR " + totalPrice +
                           " if the quantity is " + quantity +
                           " and unit price is INR " + unitPrice);

        sc.close();
    }
}
