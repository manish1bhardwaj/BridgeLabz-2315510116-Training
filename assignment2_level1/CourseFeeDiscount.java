package assignment2_level1;

public class CourseFeeDiscount {
    public static void main(String[] args) {
        
        // Step 1: Original fee
        double fee = 125000;  
        
        // Step 2: Discount percentage
        double discountPercent = 10;  
        
        // Step 3: Calculate discount amount
        double discountAmount = (fee * discountPercent) / 100;  
        
        // Step 4: Calculate final price after discount
        double finalFee = fee - discountAmount;  
        
        // Step 5: Display results
        System.out.println("The discount amount is INR " + discountAmount +
                           " and final discounted fee is INR " + finalFee);
    }
}
