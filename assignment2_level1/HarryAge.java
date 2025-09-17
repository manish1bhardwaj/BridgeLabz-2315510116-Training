package assignment2_level1;

public class HarryAge {
    public static void main(String[] args) {
        
        // Step 1: Store Harry's birth year
        int birthYear = 2000; 
        
        // Step 2: Store the current year
        int currentYear = 2024; 
        
        // Step 3: Calculate Harry's age
        int age = currentYear - birthYear; // Subtract birth year from current year
        
        // Step 4: Display the result
        System.out.println("Harry's age in " + currentYear + " is " + age);
    }
}
