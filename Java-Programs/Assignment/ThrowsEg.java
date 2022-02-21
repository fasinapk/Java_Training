package Assignment;

public class ThrowsEg {
	static void checkmark(int mark) throws ArithmeticException
	{
		if(mark<60)
			throw new ArithmeticException("failed");
		else
			System.out.println("passed");
	}

	public static void main(String[] args) {
		checkmark(40);
		System.out.println("rest of the code");


	}

}
