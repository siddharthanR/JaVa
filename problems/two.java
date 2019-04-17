import java.io.*;
import java.util.Scanner;
class Two
{
	//declare necessary variables
	int i, j, k, row, column;
	int a[][], b[][], c[][];
	int r[], col[];
	Scanner s;

	//initialising data members
	public Two(int row, int column)
	{
		i = 0;
		j = 0;
		k = 0;
		s = new Scanner(System.in);
		this.row = row;
		this.column = column;
		c = new int[row][column];
		r = new int[row];
		col = new int[column];
		a = new int[row][column];
		b = new int[row][column];
	}

	//read the 2 matrix
	public void read() {

	//reading matrix a
		System.out.println("Reading matrix A:");
		for(i = 0; i<row; i++) {
			for(j = 0; j<column; j++) {
				System.out.print("a["+i+"]["+j+"]:");
				a[i][j] = s.nextInt();
			}
		}

	//reading matrix b
		System.out.println("Reading matrix B:");
		for(i = 0; i<row; i++) {
			for(j = 0; j<column; j++) {
				System.out.print("b["+i+"]["+j+"]:");
				b[i][j] = s.nextInt();
			}
		}
	}

	//multiply matrix together
	public void multiply() {
		for(i = 0; i<row; i++) {
			for(j = 0; j<column; j++) {

				//to perform the multiplication
				c[i][j] = 0;
				//perform multiplication element by element
				for(k = 0; k<row; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}	
	}

	//add two matrix together
	public void add()
	{
		for(i = 0; i<row; i++) {
			for(j = 0; j<column; j++) {
				c[i][j] = a[i][j] + b[i][j];
 			}
		}
	}

	//display
	public void display() {
		//display c
		System.out.println("\nC matrix");
		for(i = 0; i<row; i++) {
			System.out.println();
			for(j = 0; j<column; j++) {
				System.out.print(c[i][j]+"  ");
			}
		}
	}

	//main function
	public static void main(String[] args) {
		Two two = new Two(2, 2);
		two.read();
		two.add();
		two.display();
	}
}