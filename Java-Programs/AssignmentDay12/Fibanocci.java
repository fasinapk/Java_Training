//1. Program to take a number from the user and print the Fibanocci 
//series until that number.



package Assignment12;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a no ");
		int n=s.nextInt();
		int a=0,b=1,c;
		System.out.println("fibanocci series of "+n +" numbers");
		for(int i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}

	}

}
