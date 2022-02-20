//1.Write a program that prompts the user to input a positive integer. 
//It should then output a message indicating whether the number is a prime number. 


package Assignment4;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,c=0;
		System.out.println("enter a number ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				c++;
				break;
			}
		}
		if(c==0)
			System.out.println(n +" is prime number");
		
		else
			System.out.println(n +" is not prime number");
		
		

	}

}
