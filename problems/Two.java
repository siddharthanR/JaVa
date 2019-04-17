import java.util.Scanner;
import java.io.*;
class Two
{
	String str;
	int i, len, ascii;

	//initialise
	public Two(String string) {
		i = 0;
		str = new String(string);
		len = str.length();
	}

	//converting lower case to upper case
	public void doConvert() {
		String s = "";
		System.out.println("Input String"+str);
		for(i = 0; i<len; i++) {
			ascii = str.charAt(i);
			if(ascii >= 65 && ascii <= 90) {
				//converting to lower case
				s += (char)(ascii + 32);	
			}
			else {
				//converting to lowercase
				s += (char)(ascii - 32);
			}
		}
		System.out.println("Output String:"+s);
	}

	//main
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Two two = new Two(s.next());
		two.doConvert();
	}
}