package encapsulation;

public class Employee {
	
	private int employee_id;
	
	public void getEmp(int x) {
		employee_id = x;
	}
	
	public int setEmp() {
		return employee_id;
	}
}

class Company{
	
	public static void main(String args[]) {
		
		Employee obj =new Employee();
		obj.getEmp(100);
		System.out.print(obj.setEmp());
		
}

}