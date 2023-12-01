package lesson5;

public class Home5 {

	public static void main (String [] args) {
		
		BankAccount45 MyBA = new BankAccount45(16.04);
		System.out.println("before money came " + MyBA.balance);
		MyBA.refill(60.04);
		System.out.println("before shopping " + MyBA.balance);
		MyBA.withdrawal(75.01);
		System.out.println("after shopping " + MyBA.balance);
		
		Student2 st1 = new Student2("Igor", 4, 4.5, 5.0, 3.9);
		double avrggrd = st1.AvGrade(st1.EconomyGrade, st1.LanguageGrade, st1.MathGrade);
		System.out.println("avarage grade is " + avrggrd);
		
		Employee Svetlana = new Employee (685, "Nikolayeva", 27, 850.50, "Graphic designer");
		Svetlana.SalaryIncreasment();
		System.out.println(Svetlana.salary);
		
		
	}
	
}

class BankAccount45{
	
	double balance;
	
	BankAccount45 (double b){
		balance = b;
	}

	
	void refill(double mon){	//	adding money to the balance
		balance += mon;
	}
	
	void withdrawal(double mon) {	//	using money to pay
		balance -= mon;
	}
	
}

class Student2{
	
	String name;
	int StudyYear;
	double MathGrade;
	double LanguageGrade;
	double EconomyGrade;
	
	Student2(String n, int sy, double mg, double lg, double eg){
		
		name = n;
		StudyYear = sy;
		MathGrade = mg;
		LanguageGrade = lg;
		EconomyGrade = eg;
		
	}
	
	double AvGrade (double mg, double eg, double lg) {
		double avg = (mg + eg + lg) / 3;
		return avg;
	}
	
}

class Employee {
	
	int id;
	String surname;
	int age;
	double salary;
	String department;
	
	Employee (int i, String s, int a, double sal, String d) {
		
		id = i;
		surname = s;
		age = a;
		salary = sal;
		department = d;
		
	}
	
	double SalaryIncreasment () {
		
		salary *= 2;
		return salary;
		
	}
	
}