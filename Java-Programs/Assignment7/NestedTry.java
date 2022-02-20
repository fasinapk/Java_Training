//1. Write a program to implement nested try-catch block for NUll Pointer exception
//and NumberFormat Exception

package Assignment7;

import java.util.Scanner;

public class NestedTry {

	public static void main(String[] args) {
		String str=null;
		int n;
		Scanner s=new Scanner(System.in);
		
		
		
		try
		{
			
			
			try
			{
				System.out.println("Enter a string to perform concatenation : ");
				String str1=s.next();
				
				String str2=str.concat(str1);
			}
			catch(NullPointerException e)
			{
				System.out.println("Exception occured, "+e);
			}
			System.out.println("Enter integer : ");
			n=Integer.parseInt(s.next());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Exception occured, "+e);
		}
		System.out.println("Thank You");
		

	}

}
