//3.Write a program to implement user defined exception using a Throw keyword.



package Assignment;

class UserDefinedExcptn extends Exception
{
	public UserDefinedExcptn(String str)
	{
		super(str);
	}
}

public class ThowEg2 {
	

	public static void main(String[] args) {
		try
		{
			throw new UserDefinedExcptn("this is user defined exception");
		
		}
		catch(UserDefinedExcptn ude)
		{
			System.out.println("exception occured ,"+ude);
			System.out.println(ude.getMessage());
		}

	}

}
