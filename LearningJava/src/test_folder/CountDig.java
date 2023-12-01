package somethingforme;

import java.util.Arrays;

public class CountDig {
    
    public static int nbDig(int n, int d) {
    	/*this method uses two int numbers and counts how many numbers (squares of 0 <= k <= n)
    	  contain a number d in them. */
      
        int[] squaredKs = {};	//creating an empty array for values of squared k's
        int count = 0;	// count value to count how many numbers contain d
        String strD = String.valueOf(d);	//turning a d into a string 
    
        for (int k = 0; k <= n; k++) {
            
            int squaredK = k*k;		//getting a squared k value
            
            squaredKs= Arrays.copyOf(squaredKs, squaredKs.length + 1);	//appending an array
            squaredKs[k] = squaredK;	//with squared k values
            
        }
        
        for (int i = 0; i < squaredKs.length; i++) {	//scrolling array
        	
        	String strN = String.valueOf(squaredKs[i]);		//turning each individual value of an array to a string        	
        	
        	int lastIndex = 0;
        	int number = 0;
        	while(lastIndex != -1){
        	    lastIndex = strN.indexOf(strD,lastIndex);
        	    if(lastIndex != -1){
        	        number ++;
        	        lastIndex += strD.length();
        	    }
        	}
        	if (number > 0) {		//if squared K value contains d at least one time
        		count++;	//count that this number has d in it
        	}
        	
    	}
        
        
        return count;
      
    }
    
    public static void main (String [] args) {
    	System.out.println(nbDig(25, 1));
    }
}