package q21;

public class Q21 {
	
	public static void main (String [] args) {
		
		int numberOfStars = 4;
		
		for (int i = 1; i <= numberOfStars; i++) {
			for (int j = 1; j <= i;	j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
