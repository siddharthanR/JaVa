import java.io.*;
import java.util.Scanner;

class One {
	int[] a;
	int len;
	Scanner s;
	
	public One(int size) {
		s = new Scanner(System.in);
		a = new int[size];
		len = size;
	}
	
	public void read() {
		for(int i = 0; i<len; i++)
		{
			a[i] = s.nextInt();
		}
	}
	
	public void find_number(int number) {
		for(int i = 0; i<len; i++) {
			if(a[i] == number)
				return i;
			else
				continue;
		}
	}

	public static void main(String a[]) {
		One one = new One(5);
		one.read();
		System.out.println("give the number");
	}
}