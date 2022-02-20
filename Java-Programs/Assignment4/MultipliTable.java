//2.Write a program that prompts the user to input a positive integer.
// It should then print the multiplication table of that number. 


package Assignment4;

import java.util.Scanner;

public class MultipliTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		System.out.println("enter a number ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		
		System.out.println("Multiplication Table of "+n);
		
		for(int i=1;i<=10;i++)
		{
			int r=n*i;
			System.out.println(n+" * "+i+" = "+r);
		}

	}

}
