package lesson3;

public class home3 {
	public static void main (String [] args) {
		
		int i1 = 5, i2 = 11;
		double d1 = 5.5, d2 = 1.3;
		long l = 20L;
		double result = 0;
		result = i2/d1 + d2%i1 - l;
		System.out.println(result);
		
		int a = 5, b = 8;
		int resA = a-- - --a + ++a + a++ +a;
		int resB = ++b - b++ + ++b - --b;
		System.out.println(resA);
		System.out.println(resB);
		
		
	}
}
