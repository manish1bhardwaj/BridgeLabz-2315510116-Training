package assignment2_level1;

public class PenDistribution {
    public static void main(String[] args) {
        
        // Step 1: Total pens and students
        int totalPens = 14;
        int students = 3;
        
        // Step 2: Calculate pens per student (integer division)
        int pensPerStudent = totalPens / students;
        
        // Step 3: Calculate remaining pens (modulus operator)
        int remainingPens = totalPens % students;
        
        // Step 4: Display result in one statement
        System.out.println("The Pen Per Student is " + pensPerStudent + 
                           " and the remaining pen not distributed is " + remainingPens);
    }
}
