package lesson6;

public class Home6 {
	
	public static void main (String [] args) {
		ArithmeticalCalculations jump = new ArithmeticalCalculations();
		jump.sum();
		jump.sum(1);
		jump.sum(1, 2);
		jump.sum(1, 2, 3);
		jump.sum(1, 2, 3, 4);
		
		Student3 st1 = new Student3(1235, "Igor", "Voitinko", (byte) 4, 4.5, 4.0, 4.3);
		st1.ShowParametres();
		
		Student3 st2 = new Student3 (1234, "Kolya", "Vatkin", (byte) 4);
		st2.ShowParametres();
		
		Student3 st3 = new Student3 ();
		st3.ShowParametres();
		
	}
	
}

class ArithmeticalCalculations {
	
	int sum () {
		System.out.println(0);
		return 0;
	}
	
	int sum (int a) {
		
		System.out.println(a);
		return a;
		
	}
	
	int sum (int a, int b) {
		
		int result = a + b;
		System.out.println(result);
		return result;
		
	}
	
	int sum (int a, int b, int c) {
		
		int result = a + b + c;
		System.out.println(result);
		return result;
		
	}
	
	int sum (int a, int b, int c, int d) {
	
		int result = a + b+ c + d;
		System.out.println(result);
		return result;
	
}

}

class Student3 {
	
	int id;
	String name;
	String surname;
	byte course;
	double MathGrade;
	double EconomyGrade;
	double LanguageGrade;
	
	void ShowParametres() {
		System.out.println(id + " " +  name + " " + surname + " " + course);
	}
	
	Student3(int id1, String name1, String surname1, byte course1, double MathGrade1, double EconomyGrade1, double LanguageGrade1){
		
		id = id1;
		name = name1;
		surname = surname1;
		course = course1;
		MathGrade = MathGrade1;
		EconomyGrade = EconomyGrade1;
		LanguageGrade = LanguageGrade1;
		
	}
	
	Student3(int id1, String name1, String surname1, int course1){
		
		this (id1, name1, surname1, (byte) course1, 0.0, 0.0, 0.0);
		
	}
	
	Student3 (){
		
	}
	
}