package q17;

public class Q17 {

	public static void main (String [] args) {
		
		ParentClass p1 = new ParentClass ();
		ChildClass c1 = new ChildClass ();
		
		p1.parentPrint();
		c1.childPrint();
		c1.parentPrint();
		
	}
}
