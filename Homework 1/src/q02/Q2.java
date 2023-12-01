package q02;

import java.util.Scanner;

public class Q2 {
	
	public static void SumProduct () {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter first number ");
		int a = input.nextInt();
		System.out.print("Enter second number ");
		int b = input.nextInt();
		
		int sum = a + b;
		int prod = a * b;
		
		System.out.println("Sum = " + sum + ", product = " + prod);
		
	}
	
	public static void main (String [] args) {
		
		SumProduct();
		
	}
}