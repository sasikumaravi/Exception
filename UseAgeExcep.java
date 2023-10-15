package exceptions;

public class UseAgeExcep {
	public static void main(String[] args) throws AgeException{
		System.out.println("Hi");
		String a="Ragu";
		int age=17;
		if(age>19) {
			System.out.println("You can apply voter id");
		}
		else {
			throw new AgeException("You have not valid age");
		}
		System.out.println("Welcome "+a);
		System.out.println("Your proof has been verified");
	}

}
