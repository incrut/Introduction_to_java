package homework_java_course2;

public class HeirarcInheritance {
	public static void main(String[] args) {
		
		UniversityStudent Lucy = new UniversityStudent();
		Worker John = new Worker();
		
		Lucy.age = 21;
		Lucy.gender = 'F';
		Lucy.course = 3;
		
		John.age = 26;
		John.gender = 'M';
		John.salary = 3500;
		
		Lucy.sleep();
		Lucy.study();
		John.work();
		John.sleep();
		
	}
}

class Human {
	int age;
	char gender;
	public void sleep() {
		System.out.println("ZzZz");
	}
}

class UniversityStudent extends Human {
	int course;
	public void study() {
		System.out.println("aaaaa");
	}
}

class Worker extends Human {
	int salary;
	public void work() {
		System.out.println("AAAAAAAAAAA");
	}
}