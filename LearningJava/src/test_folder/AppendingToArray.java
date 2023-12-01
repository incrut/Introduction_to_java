package somethingforme;

import java.util.Arrays;

public class AppendingToArray {

	public static void appending () {
		
		int[] arr = {10, 20, 30};	//creating an array
        System.out.println(arr.length);		//here's the length of this array
        
        arr = Arrays.copyOf(arr, arr.length + 1);	//redefining an array with a copy of it but with one more place to add
     
        arr[arr.length] = 40;	// putting this value to a new place 
        
        System.out.println(Arrays.toString(arr));	//converting an array to a string
        /* since array is a reference type of a variable then it means that when we 
         * simply print it we get a value of reference of it (but not an array itself)
         */
        
        for (int i = 0; i < arr.length; i++) {	//another way of printing an array (values of it)
        	System.out.println(arr[i]);
        }
	}
	
}
