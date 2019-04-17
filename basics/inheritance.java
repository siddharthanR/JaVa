//every time child create objects parent constructor called
//parent or base class
class Animal 
{
	Animal()
	{
		System.out.println("animal constructor");
	}
}

//child class or dervied class 1
//1 invokes parent constructor 
//2 invokes dog constructor
class Dog extends Animal
{
	Dog()
	{
		System.out.println("dog constructor");
	}	
}

//child class or derived class 2
//1 invokes parent constructor
//2 invokes cat constructor
class Cat extends Animal
{
	Cat()
	{
		System.out.println("cat constructor");
	}
}

//class where main function sits
class Main
{
	public static void main(String a[])
	{
		Cat cat = new Cat();
		Dog dog = new Dog();
	}
}