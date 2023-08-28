package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MultiTasking {
	public static void main(String[] args) throws Exception {
		System.out.println("Hi");
		String a="sam";
		try {
		System.out.println(a.charAt(5));
		}
		catch(Exception e) {
//			System.out.println(e);
//			e.printStackTrace();
		
			System.out.println("Don't try to do");
		}
		System.out.println("Byee");
		int a1=10;
		int a2=0;
		try {
		System.out.println(a1/a2);}
		catch(Exception b) {
			System.out.println("by 0 is infinity");
		}
		String numberPlate="Tn31";
		
		try {
			int num=Integer.parseInt(numberPlate);
			System.out.println(num);
		}
		catch(Exception d) {
			d.printStackTrace();
			System.out.println("Convert in a proper Way");
		}
		
		String num="a1";
		try {
			int y=Integer.parseInt(num);
		}
		
		catch(NullPointerException n) {
			System.out.println(n);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		
		File file=new File("C:\\Users\\91934\\Desktop\\text.txt");
		FileReader fr=new FileReader(file);
		int temp=0;
		while((temp=fr.read())!=-1) {
			System.out.println((char)(temp));
		}
	}
}
