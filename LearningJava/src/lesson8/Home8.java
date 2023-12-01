package lesson8;

public class Home8 {
	
	static final double pi = 3.14159265359;
	double radius;
	Home8 (double r) {
		radius = r;
	}
	
	public double area (double r) {
		
		double area = Home8.pi*r*r;
		return area;
		
	}
	
	public static double length (double r) {
		
		double len = 2*Home8.pi*r;
		return len;
		
	}
	
	public void showInfo () {
		
		System.out.println("Radius = " + radius + " area = " + area(radius) + " length = " + Home8.length(radius));
		
	}
	
	public static void main (String [] args) {
		
		System.out.println(FirstClass.multiplication(2,3,4));
		FirstClass.division(4, 2);
		FirstClass.division(16, 3);
		Home8 circle = new Home8(4.0);
		System.out.println(circle.area(circle.radius));
		circle.showInfo();
		
		
	}
	
}

class FirstClass {
	
	public static int multiplication(int a, int b, int c) {
		
		int result = a*b*c;
		return result;
		
	}
	
	public static void division (int a, int b) {
		
		int result = a / b;
		int remainder = a % b;
		System.out.println("result is " + result + " remainder is " + remainder);
		
	}
	
}