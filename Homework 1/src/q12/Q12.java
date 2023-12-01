package q12;

public class Q12 {

	public static void main (String [] args) {
		
		Student s1 = new Student (1235123, 7969015 , "Estonia, Ülenurme, Pihlaka 55" ,"Sam");
		Student s2 = new Student ("John");
		s2.phoneNumber = 4389887;
		s2.rollNumber = 8800555;
		s2.address = "Estonia, Metsla, Saare 47";
		s1.printData();
		s2.printData();
		
		
	}
	
}

class Student {
	
	int rollNumber;
	int phoneNumber;
	String address;
	String name;
	
	Student (int rollNumber, int phoneNumber, String address, String name) {
		
		this.rollNumber = rollNumber;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.name = name;
		
	}
	
	Student (String name){
		
		this (0, 0, null, name);
		
	}
	
	Student(){
		
	}
	
	public void printData () {
		
		System.out.println(name + " lives in " + address + ". Has mobile phone - " + phoneNumber + " and student roll number - " + rollNumber + ".");
		
	}
}