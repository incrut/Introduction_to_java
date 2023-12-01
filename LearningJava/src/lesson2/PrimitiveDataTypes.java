package lesson2;

public class PrimitiveDataTypes {
	public static void main (String [] args) {
		
		byte b1 = 10;
		byte b2 = 127;
		byte b3;
		b3 = -128;
		
		short s1 = 1000;
		short s2 = 32000;
		
		int i1 = 91235123;
		
		long l1 = 1000000000L;
		long l2 = 1000000001l;
		
		float f1 = 41.012345F;
		float f2 = 54.123531424f;
		
		double d1 = 441.1231352523412D;
		double d2 = 123.12413524534532;
		double d3 = 153.2352452134235d;
		
		char a = 'A';
		char b = 'C';
		char c = '3';
		char d = '#';
		char e = ' ';
		
		
		System.out.println(s1 + i1 + f1 + d1);
		System.out.println(a + b + c + d + e + ' ');
		System.out.print(d2 - d3 + l1 + l2 - f2 - s2 - b1 + b2 + b3);
		
	}
}
