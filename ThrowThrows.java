package exceptions;

import java.util.Scanner;

public class ThrowThrows {
	public static void main(String[] args) throws AgeExcep{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to our portal!!!");
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		if(age>17) {
			System.out.println("You are eligible to apply: ");
		}
		else {
			
			throw new AgeExcep("You have not valid age...");
			
		}
		System.out.println("Enter your gender: ");
		String gen=sc.next();
	}
}
