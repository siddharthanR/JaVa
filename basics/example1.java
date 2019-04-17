import java.io.*;
class Example1 
{
	String s = " ";

	Example1(String st)	{
		s = st;
	}

	//we define the type of exception thats going to occur
	//it throws jvm generated exception message
	public void add() throws StringIndexOutOfBoundsException {
		System.out.println(s.charAt(10));
	}

	public static void main(String[] args) {
		Example1 ex = new Example1("hello");
		ex.add();
	}
}