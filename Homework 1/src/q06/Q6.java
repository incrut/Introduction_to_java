package q06;

public class Q6 {
	
	public static void main (String [] args) {
		
		int[] numbers = {24, 50, 29};
		
		for (int i = 0; i < numbers.length; i++) { 
			
			for (int j = 1; j <= 9; j++) {
				System.out.print((numbers[i]*j) + " ");
			}
			System.out.print("\n");
		}
		
	}
	
}
