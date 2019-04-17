import java.util.ArrayList;
import java.util.Iterator;
import java.io.*;
class Array
{
	public static void main(String[] args) 
	{
		ArrayList <Integer> arr = new ArrayList <Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		Iterator iterator = arr.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}