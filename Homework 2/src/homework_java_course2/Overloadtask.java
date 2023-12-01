package homework_java_course2;

public class Overloadtask {
	public static void main(String[] args) {
		Overloadtask sth = new Overloadtask();
		sth.checkIfPrime("123");
		sth.checkIfPrime("123.123");
		sth.checkIfPrime();
		
	}
	
	public void checkIfPrime (String num) {
		try { 
			Integer.parseInt(num);
			System.out.println(num + " is a prime number");
		}
		catch(Exception e) {
			System.out.println(num + " is not a prime number");
		}
	}
	
	public void checkIfPrime() {
		int [] fibolist = new int[10];
		int [] factolist = new int [10];
		fibolist[0] = 0;
		fibolist[1] = 1;
		for (int i = 2; i<10; i++) {
			fibolist[i] = fibolist[i-1] + fibolist[i-2];
		}
		for (int i = 0; i < 10; i ++) {
			System.out.print(fibolist[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < 10; i ++) {
			for (int j = 1; j<= fibolist[i]; j++) {
				if (factolist[i] == 0) {
				factolist[i] = j;
				} else {
					factolist[i] = factolist[i] * j;
				}
			}
		}
		
		for (int i = 0; i < 10; i ++) {
			System.out.print(factolist[i] + " ");
		}
		
		
	}
	
}