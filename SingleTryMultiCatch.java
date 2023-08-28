package exceptions;

public class SingleTryMultiCatch {
	public static void main(String[] args) {
		System.out.println("Hi");
		String a="g9";
		try {
			int m=Integer.parseInt(a);
		}
		catch(Exception g) {
			System.out.println(g);
		}
//		catch(NullPointerException k) {
//			System.out.println(k);
//		}
//		catch(StringIndexOutOfBoundsException j) {
//			System.out.println(j);
//		}
//		catch(Exception g) {
//			System.out.println(g);
//		}
		System.out.println("Bye");
	}
}
