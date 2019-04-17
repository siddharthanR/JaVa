import java.util.Scanner;
class Example2
{
	int a, b;
	
	public Example2(int f, int g) {
		a = f;
		b = g;
	}

	public void add()throws ArithmeticException {
		if(b!=0) {
			System.out.println(a/b);
		}
		else {
			throw new ArithmeticException("0 Division Error");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Example2 ex = new Example2(s.nextInt(), s.nextInt());
		ex.add();
	}
}