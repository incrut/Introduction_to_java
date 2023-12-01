package q16;

public class Q16 {
	
	public static int getSubArrIndex (int[] Arr, int[] SubArr) {
		
		OUTER:
		for (int i = 0; i <= Arr.length - SubArr.length; i++) {
			
			for (int j = 0; j < SubArr.length; j++) {
				
				if (Arr[j + i] != SubArr[j]) {
					
					continue OUTER;
					
				}
				
				return i;
				
			}
			
		}
		
		return -1;
		
	}
	
	public static void main (String [] args) {
		
		int[] Arr = {0,1,2,3,4,5,6,7,8,9};
		int[] SubArr = {4,5,6};
		int start = getSubArrIndex(Arr, SubArr);
		int end = start + SubArr.length - 1;
		System.out.println("The subarray lies between " + start + " and " + end);
		
	}
	
}
