package lessonj12;

public class Home12 {
	
	public static void main (String [] args) {
		
		Student st1 = new Student(3, 4.2, "Igor", true);
		Student st2 = new Student(1, 5.0, "Egor", false);
		Student st3 = new Student (3, 5.0, "Kate", true);
		Student st4 = st2;
		
		Home12.StComparison (st1, st2);
		Home12.StComparison(st2, st4);
		
		Home12.StValueComparison (st1, st2);
		Home12.StValueComparison (st1, st3);
		Home12.StValueComparison (st2, st3);
		Home12.StValueComparison (st2, st4);
		
	}
	
	public static void StComparison (Student st1, Student st2) {
		if (st1 == st2) {
			System.out.println("This is the same student");
		}
		else {
			System.out.println("These are two different students");
		}
	}
	
	public static void StValueComparison (Student st1, Student st2) {
		if (st1 == st2) {
			System.out.println("This is the same student");
		}
		else {
			
			if (st1.name.equals(st2.name)) {
				System.out.println("These two students have same names");
			}
			else {
				System.out.println("These two students have different names");
			}
			
			if (st1.course == st2.course) {
				System.out.println("These two students are on the same course");
			}
			else {
				System.out.println("These two students are on the different courses");
			}
			
			if (st1.grade == st2.grade) {
				System.out.println("These two students have same grades");
			}
			else {
				System.out.println("These two students have different grades");
			}
			
			if (st1.car == st2.car) {
				System.out.println("These two students both have cars (or both don't have it)");
			}
			else {
				System.out.println("Either of these students have a car");
			}
		}
	}
	
}



class Student {
	int course;
	double grade;
	String name;
	boolean car;
	
	Student (int course, double grade, String name, boolean car) {
		this.course = course;
		this.grade = grade;
		this.name = name;
		this.car = car;
	}
	
	Student (){
		
	}
}