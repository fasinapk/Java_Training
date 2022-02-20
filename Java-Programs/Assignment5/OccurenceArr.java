//3.Write a program to input an array of integers according to the user , 
//and also take a input of a particular integer and find out the
//occurence of the intger in the array.

package Assignment5;

import java.util.Scanner;

public class OccurenceArr {

	public static void main(String[] args) {
		System.out.print("Enter the size of array : ");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[] a=new int[size];
		
		System.out.println("Enter elements of array ");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.print("Array elements are ");
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		System.out.print("Enter the element which you want to count number of occurence : ");
		int n=s.nextInt();
		int count=0;
		for(int i=0;i<size;i++)
		{
			if(a[i]==n)
				count++;
		}
		System.out.println("Number of occurrence of the element "+n+" is "+count);

	}

}
