//4.Write a program to check for the occurance of a particular character
// in a string and display how many times it has occured.
//note: take the String  and the character to be checked as a input from the user.


package Assignment6;

import java.util.Scanner;

public class Occurence {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter string : ");
		String s1=s.next();
		char[] c=s1.toCharArray();
		

		

		System.out.println("-----------------------------------------------------------");
		System.out.print("Enter the character which you want to count number of occurence : ");
		char n=s.next().charAt(0);
		
		
		int count=0;
		
		for(int i=0;i<c.length;i++)
		{
			
			if(c[i]==n){
				count++;
			}
			
		}
		System.out.println("Number of occurrence of the character "+n+" is "+count);

	}

}
