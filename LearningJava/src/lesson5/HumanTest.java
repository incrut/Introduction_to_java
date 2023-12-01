package lesson5;

public class HumanTest {
	
	public static void main (String [] args) {
		
		
		Human Igor = new Human("Igor");
		
		Igor.HisCar = new Car4 ("yellow", "V8");
		Igor.HisBankAccount = new BankAccount (1235125 ,641.64);
		
		Igor.info();
		
	}
	
}

class Human{
	
	String name;
	Car4 HisCar;
	BankAccount HisBankAccount;
	
	Human(String n){
		
		name = n;
		
	}
	
	void info() {
		System.out.println(name + " Has a " + HisCar.colour + " car with " + HisCar.engine + " engine."
			+ " His bank account id is " + HisBankAccount.id + " and he has " + HisBankAccount.balance + " dollars.");
	}
	
}

class Car4 {
	
	String colour;
	String engine;

	Car4 (String c, String e){
		
		colour = c;
		engine = e;
		
	}
	
}

class BankAccount {
	
	int id;
	double balance;
	
	BankAccount(int i, double b) {
		
		id = i;
		balance = b;
		
	}
	
}