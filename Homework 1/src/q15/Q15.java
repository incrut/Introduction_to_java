package q15;

public class Q15 {
	
	public static void main (String [] args) { 
		
		int [] example = {1,2,3,4,5,6,7,8,124,7,134,7,45,2134,7437,232,345,7564,123,-34,-345,-3245};
		
		int biggest = example[0];
		int smallest = example [0];
		
		for (int i = 0; i < example.length; i++) {
			
			if (biggest < example[i]) {
				biggest = example[i];
			}
			if (smallest > example[i]) {
				smallest = example[i];
			}
			
		}
		
		System.out.println("Smallest = " + smallest + ". Biggest = " + biggest + ".");
		
	}
	
}
