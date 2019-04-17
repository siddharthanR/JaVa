class StringException extends Exception
{
	public StringException(String s)
	{
		super(s);
	}
}
class User 
{
	public void add(int a) throws StringException
	{
		if(a < 10) {
			throw new StringException("value should greater than 10");
		}
		else {
			System.out.println("okay fine");
		}
	}
	public static void main(String[] args) {
		User u = new User();
		try
		{
			u.add(1);	
		}
		catch(Exception e)
		{
			System.out.println("exception occured"+e);
		}
		
	}
}