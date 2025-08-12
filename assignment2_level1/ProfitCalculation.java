package assignment2_level1;

public class ProfitCalculation {
    public static void main(String[] args) {
        
        // Step 1: Define cost price and selling price
        double costPrice = 129;
        double sellingPrice = 191;
        
        // Step 2: Calculate profit
        double profit = sellingPrice - costPrice;
        
        // Step 3: Calculate profit percentage
        double profitPercentage = (profit / costPrice) * 100;
        
        // Step 4: Print all details using a single println (multiline output)
        System.out.println(
            "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice +
            "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage
        );
    }
}
