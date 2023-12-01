package homework_java_course2;

public class Students {
	public static void main (String[] args) {
		}
}

interface Student {
	
	public void setId();
	public void setCourse();
	public void setSomething();
	
}

class allStudents implements Student {
	int id;
	int course;
	int something;
	public void setId() {
	}
	public void setCourse() {
	}
	public void setSomething() {
	}
}

class Student1 extends allStudents {
	public void setId(int id) {
		this.id = id;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	public void setSomething(int something) {
		this.something = something;
	}
}