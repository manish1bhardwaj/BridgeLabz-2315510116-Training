import java.util.Scanner;

public class BmiCAL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);{
            System.out.println("Please enter your weight(in kg)");
            float weight=sc.nextFloat();
            System.out.println("Please enter your height(in cm)");
            float height=sc.nextFloat();
            float BMI=weight/(height/100*height/100);
            System.out.println("your bmi is: "+BMI);
        }
    }
}
