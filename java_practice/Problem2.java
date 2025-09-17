/*Write a program that takes two numbers as input from the user and prints
their sum.*/

package java_practice;
import java.util.*;
public class Problem2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("sum is"+' '+a+' '+'+'+' '+b+' '+'='+' '+c );
		sc.close();
	}
		

}
