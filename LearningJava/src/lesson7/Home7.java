package lesson7;

public class Home7 {
	
	public static void main (String [] args) {
		
		Employee emp1 = new Employee (12423523, "Korpatov", 26, 590.15, "Teacher");
		emp1.Show(emp1.salary);
		
	}
	
}


class Employee {
	
	int id;
	public String surname;
	public int age;
	double salary;
	public String department;
	
	Employee (int i, String s, int a, double sal, String d) {
		
		id = i;
		surname = s;
		age = a;
		salary = sal;
		department = d;
		
	}
	
	Employee (int i, String s, int a, String d){
		
		this (i, s, a, 0, d);
		
	}
	
	Employee (String s, int a, String d){
		this (0, s, a, 0, d);
	}
	
	double SalaryIncreasment () {
		
		salary *= 2;
		return salary;
		
	}
	
	public void Show (int id1) {
		
		System.out.println(id1);
		
	}
	
	public void Show (String surname1) {
		System.out.println(surname1);
	}
	
	public void Show (double salary1) {
		
		System.out.println(salary1);
		
	}
	
}