//1.Write a Program to implement Finally block along with try and catch block.



package Assignment;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		System.out.print("enter a number : ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		try
		{
			int b=a/0;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception occurred "+e);
		}
		
		finally
		{
			System.out.println("finally block always execute");
			int n1=5,n2=2;
			int sum=n1+n2;
			System.out.println("Sum of "+n1+" and "+n2+ " is "+sum);
		}
		System.out.println("--------------------------------------");
		System.out.println("rest of the code");

	}

}
