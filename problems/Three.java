import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Three
{
	int row, column, i, j, c[], r[], a[][];

	//initialise constructor
	Three(int row, int column) 
	{
		i = 0;
		j = 0;
		this.row = row;
		this.column = column;
		r = new int[row];
		c = new int[column];
		a = new int[row][column];
	}

	//add columns
	public void doCompute() throws IOException {
		int k, g;
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input);
		
		//read  matrix
		for(i = 0; i<row; i++) {
			for(j = 0; j<column; j++) {
				System.out.print("Element ["+i+"]"+""+"["+j+"]:");
				a[i][j] = Integer.parseInt(reader.readLine());
			}
		}

		//adding row elements
		for(i = 0; i<row; i++) {
			k = 0;
			for(j = 0; j<column; j++) {
				k += a[i][j];
			}
			r[i] = k;
		}

		//adding column elements
		for(j = 0; j<column; j++) {
			g = 0;
			for(i = 0; i<row; i++) {
				g +=a[i][j];
			}
			c[j] = g;
		}

		this.display(r);
		this.display(c);
	}

	//display arrays
	public void display(int[] arr) {
		for(i = 0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
	}

	//main function
	public static void main(String[] args) throws IOException  {
		int row, column;
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input);
		System.out.print("ROW:");
		row = Integer.parseInt(reader.readLine());
		System.out.print("COLUMN:");
		column = Integer.parseInt(reader.readLine());
		Three three = new Three(row, column);
		three.doCompute();
	}
}