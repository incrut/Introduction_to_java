package lesson4;

class BankAccount{
	int id;
	String name;
	double balance;
}

public class ObjAndClass {
	public static void main (String [] args) {
		BankAccount MyAccount = new BankAccount();
		BankAccount YourAccount = new BankAccount();
		BankAccount HisAccount = new BankAccount();
		
		MyAccount.id = 1;
		MyAccount.name = "Nikita";
		MyAccount.balance = 12.45;
		System.out.println(MyAccount.balance);
		
		YourAccount.id = 2;
		YourAccount.name = "Igor";
		YourAccount.balance = 80.13;
		System.out.println(YourAccount.name);
		
		HisAccount.id = 3;
		HisAccount.name = "Egor";
		HisAccount.balance = 815.0;
		System.out.println(HisAccount.id);
		
		String sth = "Here is your string!";
		String nosth = new String("Here is your another string!");
		
		System.out.println(sth + ' ' + nosth);
		
	}
}
