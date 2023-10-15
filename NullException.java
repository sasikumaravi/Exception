package exceptions;

public class NullException {
	public static void main(String[] args) {
		System.out.println("Welcome");
		String s=null;
		
		try {
		System.out.println(s.toUpperCase());
		}
//		catch(NullPointerException a) {
//			System.out.println("value is null bro");
//		}
		finally {
			System.out.println("This is an important message..........");
		}
		System.out.println("Thank you");
	}
}
