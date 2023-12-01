package q20;

public class Q20 {
	
	public static void main (String [] args) {
		
		int vowels = 0;
		int consonents = 0;
		int digits = 0;
		int spaces = 0;
		
		String str = "something 124w sdg 1214 wegdsfg fsdf else 123 sd";
		
		for (int i = 0; i < str.length(); i++) {
			
			char c = str.charAt(i);
			if (c == ' ') {
				spaces++;
			}
			else if (Character.isDigit(c)) {
				digits++;
			}
			else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
				vowels++;
			}
			else {
				consonents++;
			}
			
		}
		System.out.println("Number of vowels is " + vowels + ". Number of consonents is " + consonents + ". Number of digits is " + digits + ". Number of white spases is " + spaces);
	}
	
}
