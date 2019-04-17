class Overload {	
	int a, b;

	//non parameterised constructor
	public Overload() {
		System.out.println("non parameterised constructor");
		a = 0;
		b = 0;
	}

	//parameterised constructor
	public Overload(int a, int b) {
		System.out.println("parameterised constructor");
		this.a = a;
		this.b = b;
	}

	//zero parameterized function
	public void add() {
		int c = 0;
		c = this.a + this.b;
		System.out.println("non parameterized:"+c);
	}

	//parameterized function
	public void add(int a, int b) {
		int c = 0;
		c = a + b;
		System.out.println("parameterized:"+c);
	}

	//main function
	public static void main(String[] args) {
		Overload no = new Overload();
		no.add(10, 20);
		Overload yes = new Overload(20, 40);
		yes.add();
	}
}