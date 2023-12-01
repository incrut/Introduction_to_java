package q04;

import java.util.Scanner;

public class Q4 {

	public static void grading (int mark) {
		
		if (mark < 25) {
			System.out.println("Your grade is \"F\"");
		} 
		else if (mark >= 25 && mark < 45) {
			System.out.println("Your grade is \"E\"");
		}
		else if (mark >= 45 && mark < 50) {
			System.out.println("Your grade is \"D\"");
		}
		else if (mark >= 50 && mark < 60) {
			System.out.println("Your grade is \"C\"");
		}
		else if (mark >= 60 && mark < 80) {
			System.out.println("Your grade is \"B\"");
		}
		else {
			System.out.println("Your grade is \"A\"");
		}
		
		
		
	}
	
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your mark ");
		int mark = input.nextInt();
		
		grading(mark);
		
	}
}
