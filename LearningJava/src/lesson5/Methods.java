package lesson5;

class Sum {
	
	int sum (int a, int b, int c) {
		
		int result = a + b + c;
		return result;
		
	}
}

class Car {
	
	int speed;
	String colour;
	String engine = "V4";
	
	Car(int a){
		
		System.out.println("A new car object was created");
		colour = "Blue";
		speed = a;
		
	}
	
	
}

public class Methods {
	
	public static void main (String [] args) {
		
		Sum t = new Sum();
		int sum123 = t.sum(1,2,3);
		System.out.println(sum123);
		
		Car car1 = new Car(120);
		System.out.println(car1.colour);
		System.out.println(car1.engine);
		System.out.println(car1.speed);
		
	}
}
