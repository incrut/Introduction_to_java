package lessonj16;

public class Home16 {
	
	public static void email (String s) {
		
		int a = 0;	//index location of '@' char
		int b = 0;	//index location of '.' char
		int c = 0;	//index locaTion of ';' char
		
		while (c < s.length() - 1) {
			
			a = s.indexOf('@', c);
			b = s.indexOf('.', c);
			c = s.indexOf(';', c + 1);
			System.out.println(s.substring(a + 1, b));
			
		}
		
	}
	
	public static void main (String [] args) {
		
		email("something@gmail.com; something@mail.ru; something@yandex.ru;");
		
	}
	
}
