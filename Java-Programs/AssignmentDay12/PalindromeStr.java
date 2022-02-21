//4. Program to find if a particular String is a Palindrome.




package Assignment12;

import java.util.Scanner;

public class PalindromeStr {

	public static void main(String[] args) {
		System.out.println("enter strings with multiple words");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		char ch;
		String rev="";
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			rev=ch+rev;		
		}
		if(rev.equals(str))
			System.out.println(str+" is palindrome");
		else
			System.out.println(str+" is not palindrome");

	}

}
