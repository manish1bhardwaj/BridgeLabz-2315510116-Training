/*3. Celsius to Fahrenheit Conversion
Write a program that takes the temperature in Celsius as input and converts
it to Fahrenheit using the formula:
Fahrenheit = (Celsius * 9/5) + 32.*/
package java_practice;
import java.util.*;

public class Problem3 {
	public static void main(String args[]){
		Scanner	sc = new Scanner(System.in);
		double C = sc.nextDouble();
		double F = (C* 9/5) + 32;
		System.out.println("Temperature"+' '+'='+' '+F);
		sc.close();
	}

}
