//1.Write a program to input an array of integers according to the users,
// and display the duplicate array elements.

package Assignment5;

import java.util.Scanner;

public class DispArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of integer array : ");
		int size=sc.nextInt();
		int[]  arr=new int[size];
		System.out.println("enter the elements of array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println();
		System.out.print("array elements are ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("duplicate elements are ");
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}
		
	
	}

}
