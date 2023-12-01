package q08;

import java.util.Scanner;

public class Q8 {

	public static void isEligible (int age) {
		
		if (age <= 0) {
			System.out.println("You don't even exist to vote");
		}
		else if (age < 18) {
			System.out.println("You are too young to vote");
		}
		else if (age >= 18 && age < 100) {
			System.out.println("You are at the perfect age to vote");
		}
		else if (age >= 100) {
			System.out.println("Wow you need a lot of candles on your birthday cake, of course you can vote");
			
		}
		
	}
	
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your age ");
		int age = input.nextInt();
		
		isEligible(age);
	}
}
