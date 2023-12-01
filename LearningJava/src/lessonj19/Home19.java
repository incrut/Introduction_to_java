package lessonj19;

import java.util.Arrays;

public class Home19 {
	
	public static String[] abc (String [] ... arrs) {
		int length = 0;
		for (String [] arr: arrs) {
			length += arr.length;
		}
		String [] target = new String[length];
		int count = 0;
		for (String [] arr : arrs) {
			for (String s: arr) {
				target[count] = s;
				count++;
			}
		}
		System.out.println(Arrays.toString(target));
		return target;
	}
	
	public static void main (String [] args) {
		
		String [] target = abc(new String [] {"ok", "hello", "bye"}, new String [] {"ok", "nice", "sth"});
		
		for (String s: args) {
			
			for (int i = 0; i < target.length; i++) {
				if (s.equals(target[i])) {
					target[i] = null;
				}
			}
			
		}
		System.out.println(Arrays.toString(target));
	
	}
	
}