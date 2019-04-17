interface Fruits
{
	abstract void createFruit();
	abstract void deleteFruit();
	abstract void showFruit();
}

class Apple implements Fruits
{
	public Apple()
	{
		System.out.println("Apple constructor");
	}
	public void createFruit()
	{
		System.out.println("createFruit");
	}
	public void deleteFruit()
	{
		System.out.println("deleteFruit");
	}
	public void showFruit()
	{
		System.out.println("showFruit");
	}
	public static void main(String a[])
	{
		Apple apple = new Apple();
		apple.createFruit();
		apple.deleteFruit();
		apple.showFruit();
	}
}