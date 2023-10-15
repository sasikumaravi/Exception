package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;



public class FileNot {
	public static void main(String[] args) throws Exception,FileNotFoundException  {
		File f1=new File("C:\\Users\\91934\\Desktop\\String logics.txt");
			FileReader f2=new FileReader(f1);
			int temp=0;
			while((temp=f2.read())!=-1) {
				System.out.println(temp);
			}
	}
}
