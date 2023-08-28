package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotExep {
	public static void main(String[] args) throws Exception{
		File d=new File("C:\\Users\\91934\\Desktop\\text.txt");
		FileReader hr=new FileReader(d);
		int temp=0;
		while((temp=hr.read())!=-1) {
			System.out.println((char)(temp));
		}
		
	}
}
