package lesson2;

public class home2 {
	public static void main (String [] args) {
		
		byte b1 = 12;
		byte b2 = 0b1100;
		byte b3 = 014;
		byte b4 = 0XC;
		System.out.println(b1 + b2 - b3 - b4);
		
		short s1 = 0;
		short s2 = 0B0;
		short s3 = 00;
		short s4 = 0x0;
		System.out.println(s1 + s2 - s3 - s4);
		
		int i1 = 150;
		int i2 = 0b10010110;
		int i3 = 0226;
		int i4 = 0x96;
		System.out.println(i1 + i2 - i3 - i4);
		
		long l1 = -1300;
		long l2 = 0b1111111111111111111111111111111111111111111111111111101011101100L;
		long l3 = 01777777777777777775354L;
		long l4 = 0xFFFFFFFFFFFFFAECL;
		System.out.println(l1 - l2 + l3 - l4);
		
		float f1 = 16.4F;
		float f2 = 15.12344235232423f;
		
		double d1 = 1234.35234234235;
		double d2 = 1225325.2353463234;
		
		boolean IsHappy = true;
		boolean IsSad = false;
		
		System.out.println(IsSad);
		System.out.println(IsHappy);
		System.out.println(f1 + f2);
		System.out.println(d2 - d1);
		
		char a = 'A';
		char b = 98;
		char c = '\u0063';
		
		System.out.print(a);
		System.out.print(b);
		System.out.print(c);
		
	}
}
