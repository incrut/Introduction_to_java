package q11;

public class Q11 {

	public static void main (String [] args) {
		
		AddDistance d1 = new AddDistance(4);
		AddDistance d2 = new AddDistance(3.19);
		System.out.println("First distance - " + d1.distance + ". Second distance - " + d2.distance + ".");
	}
	
}

class AddDistance {
	
	double distance;
	
	AddDistance (double distance) {
		this.distance = distance;
	}
	
	AddDistance (int distance) {
		this.distance = distance;
	}
}