//4.Write a program to input a String array and display it, and now to copy
//the elements into another array in the reverse 
//order and print the reverse_array elements.

package Assignment5;

import java.util.Scanner;

public class ReverseArr {

	public static void main(String[] args) {
		System.out.print("enter the size of array : ");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		String[] a=new String[s];
		
		System.out.println("enter elements of array");
		for(int i=0;i<s;i++)
		{
			 a[i]=sc.next();
		}
		
		System.out.print("Elements are ");
		for(int i=0;i<s;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		String[] rev=new String[s];
		System.out.println("--------------------");
		System.out.print("reversed array ");
		for(int i=s-1;i>=0;i--)
		{
			rev[i]=a[i];

			System.out.print(rev[i]+" ");
		}
		
			
		
		

	}

}
