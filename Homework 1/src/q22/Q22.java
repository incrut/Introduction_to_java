package q22;

public class Q22 {
	
	public static void main (String [] args) {
		
		int numberOfStars = 5;
		
		for (int i = numberOfStars; i >= 0; i -= 2) {
			for (int j = 1; j <= i; j ++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 3; i <= numberOfStars; i +=2) {
			for (int j = 1; j <= i; j ++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
	
}
