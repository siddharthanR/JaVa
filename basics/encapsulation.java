import java.io.*;
import java.util.Scanner;
class Encapsulation 
{
	private int rollno;
	private String name;
	//constructor
	public Encapsulation() {
		System.out.println("constructor");
	}
	//set name
	public void setName(String name) {
		this.name = name;
	}
	//set rollno
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	//retrieve rollno
	public int getRollno() {
		return this.rollno;
	}
	//retrieve name
	public String getName() {
		return this.name;
	}
	//main function
	public static void main(String[] args) {
		int i = 0, a = 0;
		String s = " ", t = " ";
		Scanner sr = new Scanner(System.in);
		System.out.println("enter roll number");
		a = sr.nextInt();
		System.out.println("enter name");
		t = sr.next();
		Encapsulation encapsulation = new Encapsulation();
		encapsulation.setName(t);
		encapsulation.setRollno(a);
		s = encapsulation.getName();
		i = encapsulation.getRollno();
		System.out.println("name:"+" "+s+" "+"rollno:"+" "+i);
	}
}