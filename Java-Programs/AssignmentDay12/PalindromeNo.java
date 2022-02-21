//5. Program to find the first 10 natural palindrome numbers.


package Assignment12;

public class PalindromeNo {

	public static void main(String[] args) {
		int n, b, rev = 0;
//		int N = 100;
		int N = 10;
		
		
		System.out.print("Palindrome numbers from 1 to 10:");
//		for (int i = 10; i <= N; i++)
		for (int i = 1; i <= N; i++)
		{
			n = i;
			while (n > 0)
			{
				b = n % 10;
				rev = rev * 10 + b;
				n = n / 10;
			}
			if (rev == i)
			{
				System.out.print(i + " ");
			}
			rev = 0;
		}
		
	}

}
