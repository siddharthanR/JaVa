class Method
{
	//constructor
	public Method() 
	{
		System.out.println("class Constructor");
	}

	//generics method which accepts any type
	public <M> void show(M[] m) {
		System.out.println("Elements");
		for(M i : m)
		{
			System.out.println(i);
		}
	}
	//main function
	public static void main(String[] args) 
	{
		//wrapper class for integer, character, float
		Integer[] in = {1,2,3,4,5,6,7,8,9};
		Character[] ch = {'a','b','c','d','e','f','g','h','i'};
		Float[] ft = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f};
		Method method = new Method();
		method.show(in);
		method.show(ch);
		method.show(ft);
	}
}