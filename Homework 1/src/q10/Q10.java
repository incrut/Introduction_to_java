package q10;

import java.util.Scanner;

public class Q10 {
	
	public static void main (String [] args) {
		
		Avarage obj = new Avarage();
		obj.printAverage(4, 5, 6);
		obj.printAverage(4.5, 4.15, 15.2);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number ");
		int a = input.nextInt();
		System.out.print("Enter second number ");
		int b = input.nextInt();
		System.out.print("Enter third number ");
		int c = input.nextInt();
		obj.printAverage(a, b, c);
		
		
	}
	
}

class Avarage {
	
	public void printAverage (int a, int b, int c) {
	
		double sum = a + b + c;
		double av = sum/3;
		System.out.println("Average value of " + a + ", " + b + " and " + c + " is " + av);
		
	}
	
	public void printAverage (double a, double b, double c) {
		
		double sum = a + b + c;
		double av = sum/3;
		System.out.println("Average value of " + a + ", " + b + " and " + c + " is " + av);
		
	}
}