import java.io.*;
import java.util.Scanner;

//class
class Palindrome
{
	public static String input;
	public static Scanner s;
	
	//constructor
	public Palindrome() {
		s = new Scanner(System.in);
	}
	
	//read input from console
	public static String read() {
		System.out.println("give the input");
		input = s.nextLine();
		return input;
	}

	//checking the string is palindrome or not
	public void check() {
		String ip = " ", op = " "; 
		ip = read();

		//read the string from reverse and store it
		for (int i = ip.length() - 1; i >= 0; i--) {
			op = op + ip.charAt(i);
		}

		//checking the reversed matches with the original
		String result = (ip.equalsIgnoreCase(op)) ? "Yes" : "No";
		System.out.println(result);
	}
	
	//main function
	public static void main(String a[]) {
		Palindrome p = new Palindrome();
		p.check();
	}
}