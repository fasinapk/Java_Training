//2.Write a Program to implement Throw Keyword and handle the exceptions.

package Assignment;

public class ThrowEg {
	public static void checkmark(int mark)
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
