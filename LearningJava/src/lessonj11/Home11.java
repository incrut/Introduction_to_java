package lessonj11;

public class Home11 {
	
	public static void changeDoorNumber(Car car1 ,int doorNumber) {
		
		car1.numberOfDoors = doorNumber;
		
	}
	
	public static void coulourExchange (Car car1, Car car2) {
		
		Car car3 = new Car();
		car3.colour = car1.colour;
		car1.colour = car2.colour;
		car2.colour = car3.colour;
		
	}
	
	public static void main (String [] args) {
		
		Car car1 = new Car("black", "V1", 6);
		Car car2 = new Car("red", "V2", 2);
		changeDoorNumber(car1, 4);
		coulourExchange(car1, car2);
		
		System.out.println(car1.numberOfDoors);
		System.out.println(car1.colour);
		System.out.println(car2.colour);
		
	}
	
}
