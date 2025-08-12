package assignment2_level1;

import java.util.Scanner;

public class FeeDiscountCalculator {
    public static void main(String[] args) {
        
        // Step 1: Declare variables
        double fee, discountPercent, discount, finalFee;
        
        // Step 2: Create Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Step 3: Take user input for fee
        System.out.print("Enter the student fee (INR): ");
        fee = input.nextDouble();
        
        // Step 4: Take user input for discount percentage
        System.out.print("Enter the university discount percentage: ");
        discountPercent = input.nextDouble();
        
        // Step 5: Calculate discount amount
        discount = (fee * discountPercent) / 100;
        
        // Step 6: Calculate final fee after discount
        finalFee = fee - discount;
        
        // Step 7: Output result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
        
        // Step 8: Close scanner
        input.close();
    }
}
