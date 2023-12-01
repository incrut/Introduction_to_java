package q09;

import java.util.Scanner;

public class Q9 {
	
	public static int product () {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number ");
		int a = input.nextInt();
		System.out.print("Enter second number ");
		int b = input.nextInt();
		
		int product = a * b;
		
		return product;
		
	}
	
	public static void main (String [] args) {
		
		System.out.println("The product of two your numbers is " + product());
		
	}
}
