package exceptions;

public class Excetion1 {
	public static void main(String[] args) {
		System.out.println("Hello");
		int a=18;
		int b = 23;
		int c=0;
		String name="";
		System.out.println(a+b);
		System.out.println("Thala Sk...");
		try {
			System.out.println(a/c);
			System.out.println(name.toUpperCase());
			//System.out.println(b/c);
		}
		catch(Exception e){
//		System.out.println(e);
			e.printStackTrace();
	//		System.out.println("Don't try any number by 0");
		}
		finally {
			System.out.println("errorrrrr");
		}
		System.out.println(a*b);
		
		System.out.println("World");
		System.out.println("BMW");
	}
}
