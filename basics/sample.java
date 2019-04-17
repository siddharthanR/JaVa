class Sample
{
	Sample()
	{

	}
	public void add(int a, int b)
	{
		int a = 10;
		int b = 20;
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		int a = 10;
		int b = 30;
		Sample s = new Sample(10, 30);
		s.add();
	}
}