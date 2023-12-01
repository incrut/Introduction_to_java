package q05;

public class Q5 {
	
	public static void upperOrLower (char a) {
		
		if (a >= '\u0061' && a <= '\u007A') {
			System.out.println("It is written in lower case " + a);
		}
		else if (a >= 65 && a <= 90) {
			System.out.println("it is written in upper case " + a);
		}
		else {
			System.out.println("It is not an english alphabet letter " + a);
		}
		
	}
	
	public static void main (String [] args) {
		
		upperOrLower('c');
		upperOrLower ('M');
		upperOrLower('^');
		
	}
}
