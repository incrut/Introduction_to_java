package q18;

public class Member {
	String name;
	int age;
	String phoneNumber;
	String address;
	double salary;
	
	Member (String name, int age, String phoneNumber, String address, double salary) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
	}
	
	Member (){
		
	}
	
	public void printSalary() {
		System.out.println(name + "'s salary is " + salary);
	}
}