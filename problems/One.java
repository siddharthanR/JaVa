import java.util.Scanner;

class One {
	String s;
	int i, len;
	
	//intialisation
	One(String string) {
		s = new String(string);
		i = 0;
		len = s.length();
	}

	//change 
	public void doChange() {
		String st = "";
		for(i = 0; i<len; i++) {
			if(i % 2 == 0) {
				st += Character.toUpperCase(s.charAt(i));
			}
			else {
				st += Character.toLowerCase(s.charAt(i));
			}
		}
		System.out.println(st);
	}
	
	//Main function	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		One one = new One(s.next());
		one.doChange();
	}
}