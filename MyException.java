package exceptions;

public class MyException extends Exception {
	// A Class that represents use-defined exception
		public MyException(String s)
		{
			// Call constructor of parent Exception
			super(s);
		}
	}

