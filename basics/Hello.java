import java.io.*;

class Hello {
	int a;
	int b;
	public Hello(int x, int y) {
		this.a = x;
		this.b = y;
	}
	public void add() {
		int k = 0;
		k = a + b;
		this.show(k);
	}
	public void show(int g) {
		System.out.println(g);
	}
	public static void main(String a[]) {
		int total = 0;
		Hello hello;
		hello = new Hello(10, 20);
		hello.add();
	}
}