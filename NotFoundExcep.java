package exceptions;

import java.util.Scanner;

public class NotFoundExcep {
	public static void main(String[] args) throws AgeException, Exception {
		System.out.println("Hi");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		String name=sc.nextLine();
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("You are Eligible to Create account ");
		}
		else {
			throw new AgeException("Not eligible");
		}
		System.out.println("Enter the Gender: ");
	}
}
