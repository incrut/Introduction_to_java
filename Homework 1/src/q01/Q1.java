package q01;

import java.util.Scanner;

public class Q1 {
	
	public static void SumProduct (int a, int b) {
		
		int sum = a + b;
		int product = a * b;
		System.out.println("Sum = " + sum + ", Product = " + product);
	}
	
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number ");
		int a = input.nextInt();
		System.out.print("Enter second number ");
		int b = input.nextInt();
		
		SumProduct(a, b);
		
	}
}