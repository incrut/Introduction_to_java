package q18;

public class Q18 {
	
	public static void main (String [] args) {
		
		Member m1 = new Member("John", 26, "709 5266" ,"Estonia, Metsla, Saare 47", 850.50);
		m1.printSalary();
		Employee e1 = new Employee("Sam", 46, "199 2455" ,"Estonia, Järvamaa, Liini 78", 3000.00, "Team leader");
		e1.printSalary();
		Manager ma2 = new Manager("Jamce", 32, "381 8621" ,"Estonia, Viljandimaa, Kuuse 65", 3200.00, "Team leader");
		ma2.printSalary();
	}
	
}
	