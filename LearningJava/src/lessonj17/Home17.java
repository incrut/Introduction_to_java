package lessonj17;

public class Home17 {
	
	public static boolean equality (StringBuilder sb1, StringBuilder sb2) {
		
		if (sb1.length() != sb2.length()) {
			return false;
		}
		
		for (int i = 0; i < sb1.length(); i++) {
			
			if (sb1.charAt(i) == sb2.charAt(i)) {
				continue;
			}
			else {
				return false;
			}
			
		}
		
		return true;
		
	}
	
	public static void main (String [] args) {
		StringBuilder sb1 = new StringBuilder ("Hello Everyone!");
		StringBuilder sb2 = new StringBuilder ("Hello Everyone!");
		System.out.println(equality(sb1, sb2));
		StringBuilder sb3 = new StringBuilder ("Goodbye Everyone!");
		StringBuilder sb4 = new StringBuilder ("Good morning, Everyone!");
		System.out.println(equality(sb3, sb4));
	}
	
}
