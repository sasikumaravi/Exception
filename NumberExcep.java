package exceptions;

public class NumberExcep {
	public static void main(String[] args) {
		System.out.println("Welcome");
		String a="TN-31";
		try {
			
			int b=Integer.parseInt(a);
			System.out.println(b);
		}
		catch(NumberFormatException r) {
			r.printStackTrace();
			System.out.println("Can't store String in integer");
		}
		
		System.out.println("Thank You");
		
	}
}
