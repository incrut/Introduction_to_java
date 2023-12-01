package lessonj18;

import java.util.Arrays;

public class Home18 {
	
	public static void main (String [] args) {
		 
		int[] arr = {1,2,4,6,4,1,7,8,9,43,4};
		System.out.println(Arrays.toString(sorting(arr)));
		
	}

	public static int[] sorting (int[] arr) {

		int a;
		for (int i = 0; i < arr.length; i++) {
			int min = arr[i];
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					index = j;
				}
			}
			if (i != index) {
				a = arr[i];
				arr[i] = min;
				arr[index] = a;
			}
		}
		return arr;
		
	}
	
}
