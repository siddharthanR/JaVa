import java.io.*;
import java.util.Scanner;
//keyword
class Keyword 
{
	int a;
	String name;
	
	//constructor 1
	public Keyword()
	{
		System.out.println("non parametarized constructor");
	}
	
	//constructor 2
	public Keyword(int a, String name)
	{	
		//calls the non parametarized constructor
		this();
		this.a = a;
		this.name = name;
	}
	
	//method that return current invoking object
	public Keyword get()
	{
		return this;
	}

	//main function
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Keyword old;
		int one = 0;
		String two = "";
		one = s.nextInt();
		two = s.next();
		Keyword key = new Keyword(one, two);
		old = key.get();
		System.out.println(old+"-->returned one");
		System.out.println(key+"-->created one");
	}
}