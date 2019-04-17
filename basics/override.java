//base class
class Fruit
{
	//base class constructor
	public Fruit() {
		System.out.println("show from base class");
	}
	//overriding methood
	public void show() {
		System.out.println("show from base class");
	}
}

//derived class
class Apple extends Fruit {
	//derived class constructor
	public Apple() {
		System.out.println("derived class");
	}
	//overriding method
	public void show() {
		System.out.println("show from derived class");
	}
}

//class where main function sits
public class Main {
	public static void main(String[] args) {
		Fruit fruit = new Fruit(); //parent class reference and object.
		Fruit apple = new Apple(); //parent clas reference and child object.

		fruit.show(); //calls base class show()
		fruit.show(); //calls derived  class show()
	}
}