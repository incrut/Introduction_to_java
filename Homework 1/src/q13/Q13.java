package q13;

import java.util.Scanner;

public class Q13 {

	public static void main (String [] args) {
		
		Area r1 = new Area();
		r1.setDim();
		System.out.println("Area of a rectangle = " + r1.getArea());
		
	}
	
}

class Area {
	
	int length, breadth;
	
	public void setDim () {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the length of a rectangle ");
		this.length = input.nextInt();
		System.out.print("Enter the breadth of a rectangle ");
		this.breadth = input.nextInt();
	}
	
	public int getArea () {
		
		int area = length * breadth;
		return area;
		
	}
}