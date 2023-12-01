package lesson4;

class Student{
	int id;
	String name;
	String LastName;
	byte StudyYear;
	double AvarageMathGrade;
	double AvarageEconomyGrade;
	double AvarageLanguageGrade;
	double AvarageGrade;
	
}

public class home4 {

	public static void main (String [] args) {
		
		Student Kolya = new Student();
		Student Irina = new Student();
		Student Igor = new Student();
		
		Kolya.id = 1;
		Kolya.name = "Kolya";
		Kolya.LastName = "Vidrin";
		Kolya.AvarageEconomyGrade = 4.3;
		Kolya.AvarageLanguageGrade = 3.5;
		Kolya.AvarageMathGrade = 4.0;
		Kolya.AvarageGrade = (Kolya.AvarageMathGrade + Kolya.AvarageEconomyGrade + Kolya.AvarageLanguageGrade)/3;
		
		
		Irina.id = 2;
		Irina.name = "Irina";
		Irina.LastName = "Kuznecova";
		Irina.AvarageEconomyGrade = 5.0;
		Irina.AvarageLanguageGrade = 5.0;
		Irina.AvarageMathGrade = 5.0;
		Irina.AvarageGrade = (Irina.AvarageMathGrade + Irina.AvarageEconomyGrade + Irina.AvarageLanguageGrade)/3;

		
		Igor.id = 3;
		Igor.name = "Igor";
		Igor.LastName = "Voitenko";
		Igor.AvarageEconomyGrade = 4.0;
		Igor.AvarageLanguageGrade = 4.5;
		Igor.AvarageMathGrade = 3.75;
		Igor.AvarageGrade = (Igor.AvarageMathGrade + Igor.AvarageEconomyGrade + Igor.AvarageLanguageGrade)/3;

		
		System.out.println(Kolya.id + ") " + Kolya.name + " " + Kolya.LastName + " Avg Grade is " + Kolya.AvarageGrade);
		System.out.println(Irina.id + ") " +  Irina.name + " " + Irina.LastName + " Avg Grade is " + Irina.AvarageGrade);
		System.out.println(Igor.id + ") " +  Igor.name + " " + Igor.LastName + " Avg Grade is " + Igor.AvarageGrade);
		
	}
	
}
