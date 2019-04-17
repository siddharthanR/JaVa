class Inner 
{
	class A
	{
		public void disp()
		{
			System.out.println("hello world");
		}
	}
	public static void main(String[] args) {
		Inner i = new Inner();
		Inner.A a = i.new A();
		a.disp();
	}
}