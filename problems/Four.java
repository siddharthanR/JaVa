import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Four
{
	int i, j, row, column, a[][];

	//constructor
	public Four(int row, int column) {
		i = 0;
		j = 0;
		this.row = row;
		this.column = column;
		a = new int[row][column];
	}

	//compute diagonal sum
	public void doCompute() {
		
	}

	//main
	public static void main(String[] args) {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input);
		Four four = new Four(reader.readLine());
	}
}