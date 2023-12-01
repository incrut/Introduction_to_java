package lessonj15;

public class Home15 {

	public static void time () {
		
		int hour = 0;
		HOURS:
			while (hour < 6) {
				
			int minute = -1;
			
			MINUTES:
				do {
					
					minute++;
					
				if (hour > 1 && minute % 10 == 0) { 
					
					break HOURS;
				
				}
				
				int second = 0;
				
				while (second < 60) {
					
					if (second * hour > minute) {
						
						continue MINUTES;
						
					}
					
					System.out.println(hour + ":" + minute + ":" + second);
					
					second++;
				}
				
								
			} while (minute < 59);
			
			hour++;
			
		}
		
	}
	
	
	public static void main (String [] args) {
		
		time();
		
	}
}
