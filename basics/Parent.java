class Parent 
{
	public void div() 
	{
		System.out.println("hello");
	}
}
class Child extends Parent
{						
	public void div() throws ArithmeticException
	{
		System.out.println("world");
	}
	public static void main(String[] args) {
		Parent p = new Parent();
		Parent p1 = new Child();
		p.div();
		p1.div();
	}
}