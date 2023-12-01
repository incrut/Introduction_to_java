package lesson8;

public class NonAccessModifier {
	
	public final int a = 10;	//	now variable "a" cannot be changed to another value (it is 10 forever)
	
	public static void main (String [] args) {
		
		NonAccessModifier t = new NonAccessModifier();
		System.out.println(t.a);
		
	}
	
}
