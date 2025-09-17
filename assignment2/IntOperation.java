package assignment2;
import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for a, b, and c
        System.out.print("Enter value for a: ");
        int a = sc.nextInt();

        System.out.print("Enter value for b: ");
        int b = sc.nextInt();

        System.out.print("Enter value for c: ");
        int c = sc.nextInt();

        // Perform operations according to precedence rules
        // Multiplication (*) and division (/) have higher precedence than addition (+) and subtraction (-)
        int result1 = a + b * c;     // b*c is done first, then added to a
        int result2 = a * b + c;     // a*b is done first, then c is added
        int result3 = c + a / b;     // a/b is done first, then added to c
        int result4 = a % b + c;     // a%b is done first, then added to c

        // Display the results
        System.out.println("The results of Int Operations are " +
                           result1 + ", " + result2 + ", " + result3 + ", " + result4);

        sc.close();
    }
}
