package lessonj13;

public class Home13 {
	
	public static void NumberOfDaysInMonth (int num) {
		
		switch (num) {
		case (1):
			System.out.println("31 days in jan");
			break;
		case (2):
			System.out.println("28 days in feb");
			break;
		case (3):
			System.out.println("31 days in march");
			break;
		case (4):
			System.out.println("30 days in apr");
			break;
		case (5):
			System.out.println("31 days in may");
			break;
		case (6):
			System.out.println("30 days in jun");
			break;
		case (7):
			System.out.println("31 days in jul");
			break;
		case (8):
			System.out.println("31 days in aug");
			break;
		case (9):
			System.out.println("30 days in sep");
			break;
		case (10):
			System.out.println("31 days in oct");
			break;
		case (11):
			System.out.println("30 days in nov");
			break;
		case (12):
			System.out.println("31 days in dec");
			break;
		default:
			System.out.println("Something went wrong");
			break;
		}
		
	}
	
	public static void BetterNumberOfDaysInMonth (int num) {
		
		switch (num) {
		case 2:
			System.out.println("28 days in feb");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 days in month");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 days in month");
			break;
		default:
			System.out.println("Something went wrong");
			break;
		}
		
	}
	
	
	public static void main (String [] args) {
		int number = 1;
		Home13.NumberOfDaysInMonth(number);
		Home13.BetterNumberOfDaysInMonth(number);
	}
	
}
