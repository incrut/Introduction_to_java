package q14;

public class Q14 {
	
	public static void main (String [] args) {
		
		int[][] arr2d= {{1,2,3,4,5},
				   {5,6,1,66,4},
				   {22,15,84,32},
				   {1,4,6,7,9,1}
				   };
		for (int i = 0; i < arr2d.length; i++) {
			for (int j = 0; j < arr2d[i].length; j++) {
				System.out.print(arr2d[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
}
