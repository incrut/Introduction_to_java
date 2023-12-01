package lesson6;

public class MethodOverloading {

	void ShowInt(int i) {
		System.out.println(i);
	}
	
	void ShowBool(boolean b) {
		System.out.println(b);
	}
	
	void Show(float f) {
		System.out.println(f);
	}
	
	void Show(String s) {
		System.out.println(s);
	}
	
	void Show(byte but) {
		System.out.println("your variable is byte");
		System.out.println(but);
		System.out.println("that's the end of the method");
	}
	
	public static void main (String [] args) {
		
		MethodOverloading crya = new MethodOverloading();
		crya.ShowInt(16);
		int a = 500;
		crya.ShowInt(a);
		boolean bol = true;
		crya.ShowBool(bol);
		
		float f1 = 14.12323F;
		crya.Show(f1);
		
		byte b1 = 127;
		crya.Show(b1);
		
		String something = "Igor was here";
		crya.Show (something);
		
		
		
	}
}
