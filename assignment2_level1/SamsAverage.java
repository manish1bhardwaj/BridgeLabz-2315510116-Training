package assignment2_level1; // Package name

public class SamsAverage {
    public static void main(String[] args) {
        
        // Step 1: Store Sam's marks
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        
        // Step 2: Calculate the average
        double average = (maths + physics + chemistry) / 3.0; 
        // Using 3.0 ensures division is done in double (decimal) form
        
        // Step 3: Display the result
        System.out.println("Sam’s average mark in PCM is " + average);
    }
}
