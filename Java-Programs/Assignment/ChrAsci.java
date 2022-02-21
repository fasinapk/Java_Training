
//3.Write a program to input a character array and print the ASCII 
//value of those characters.



package Assignment;

import java.util.Scanner;

public class ChrAsci {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter characters...");
		char[] a = s.next().toCharArray();
		System.out.println("characters are ");
		
		for (int i = 0; i < a.length; i++) {
			   System.out.print(a[i]+ " ");
			}
		
		 System.out.println();
		 System.out.println("-------------------------------");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("ASCII value of "+a[i]+" is "+(int)a[i]);
		}
	}

}
