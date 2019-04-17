//generic class
// <T> T is the generic type
class Generics <T>
{
	//creating instance for generic 
	private T t;
	Generics(T t)
	{
		this.t = t;
	}

	//display the values
	public void show()
	{
		System.out.println("Value:-->"+" "+this.t);
	}

	//main function
	public static void main(String[] args) 
	{
		Generics <Integer> g1 = new Generics <Integer>(10);
		g1.show();
		Generics <String> g2 = new Generics<String>("hello");
		g2.show();
		Generics <Float> g3 = new Generics<Float>(10.24f);
		g3.show();
		Generics <Character> g4 = new Generics<Character>('s');
		g4.show();
	}
}