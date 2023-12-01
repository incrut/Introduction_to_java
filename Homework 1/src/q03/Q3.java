package q03;

import java.util.Scanner;

public class Q3 {
	
	public static void comparison (int a, int b, int c) {
		
		if (a==b && a==c) {
			System.out.println("All 3 numbers are equal");
		}
		else if ((a==b && a!=c) || (a!=b && a==c) || (b==c && b!=a)) {
			System.out.println("2 of them are equal");
		}
		else {
			System.out.println("None of them are equal");
		}
		
	}
	
	public static void main (String [] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter first number ");
		int a = input.nextInt();
		System.out.print("Enter second number ");
		int b = input.nextInt();
		System.out.print("Enter third number ");
		int c = input.nextInt();
		
		comparison(a, b, c);
		
	}
}
