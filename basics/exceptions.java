import java.io.*;
import java.util.Scanner;
class Exceptions
{
	int a;
	Scanner s;
	public Exceptions()
	{
		a = 0;
		s = new Scanner(System.in);
	}
	public void add()
	{	//possibility of error
		try
		{
			a = s.nextInt();	
		}
		//handling errors
		catch(Exception e)
		{
			System.out.println("exception occured");
		}
		//finally block
		finally
		{
			System.out.println("finally block");
		}
	}
	public static void main(String[] args) {
		Exceptions ex = new Exceptions();
		ex.add();
	}
}