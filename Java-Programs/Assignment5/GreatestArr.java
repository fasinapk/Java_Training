
//2.Write a program to input an array of integers according to the users, 
//and find the greatest value of them.

package Assignment5;

import java.util.Scanner;

public class GreatestArr {

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
		System.out.println();
		int max=a[0],sum=0;
		for(int i=0;i<size;i++)
		{
			if(a[i]>max)
				max=a[i];
			sum+=a[i];
		}
		System.out.println("Greatest is "+max);
		

	}

}
