package q07;

import java.util.Arrays;

public class Q7 {

	public static void highestCommonFactor (int a, int b) {
		
		int[] aDivisors = {};
		int[] bDivisors = {};
		
		for (int i = 1; i <=a; i++) {
			if (a%i == 0) {
				aDivisors = Arrays.copyOf(aDivisors, aDivisors.length + 1);
				aDivisors[aDivisors.length - 1] = i;
			}
		}
		
		for (int i = 1; i <=b; i++) {
			if (b%i == 0) {
				bDivisors = Arrays.copyOf(bDivisors, bDivisors.length +1);
				bDivisors[bDivisors.length - 1] = i;
			}
		}
		
		int[] smallerArray;
		int [] biggerArray;
		
		if (aDivisors.length <= bDivisors.length) {
			smallerArray = aDivisors;
			biggerArray = bDivisors;
		}
		else {
			smallerArray = bDivisors;
			biggerArray = aDivisors;
		}
		
		
		int commonDivisor = 0;
		
		for (int i = 0; i < smallerArray.length; i++) {
			
			for (int j = 0; j < biggerArray.length; j++) {
				
				if (smallerArray[i] == biggerArray[j]) {
					commonDivisor = smallerArray[i];
				}
				
			}
			
		}
		
		System.out.println("A common divisor for " + a + " and " + b + " is " + commonDivisor);
	}
	
	public static void main (String [] args) {
		
		highestCommonFactor(69, 45);
		highestCommonFactor(12, 15);
		highestCommonFactor(48, 96);
		
	}
}
