//1. program to take input of two integer arrays from the user and to
//find the sum of both the arrays.Sort the elements of the 
//resultant array in ascending order using selection sort.

package Assignment;

import java.util.Scanner;

public class SortArraySelectnSum {
	void Sort(int arr3[])
	{
		int n=arr3.length;
		//one by one move boundary of unsorted array
		for(int i=0;i<n-1;i++)
		{
			//find min elemnt in unsorted array
			int min=i;
			
			for(int j=i+1;j<n;j++)
			{
				if(arr3[j]<arr3[min])
					min=j;
			}
			//swap found min elemnt with the 1st elemnt
			int temp=arr3[min];
			arr3[min]=arr3[i];
			arr3[i]=temp;
			

		}
	}
	
	//print array
	
	void printArray(int arr3[])
	{
		int n=arr3.length;
		for(int i=0;i<n;i++)
			System.out.print(arr3[i] + " ");
		System.out.println();
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of integer array");
		int size=sc.nextInt();
		
		int[] arr1=new int[size];
		int[] arr2=new int[size];
		int[] arr3=new int[size];
		
		System.out.println("enter elements of 1st array");
		for(int i=0;i<size;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		
		
		System.out.println("enter elements of 2nd array");
		for(int i=0;i<size;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<size;i++)
		{
			arr3[i]=arr1[i]+arr2[i];
		}
		
		
		System.out.println("sum of array elements ");
		for(int j=0;j<size;j++)
		{
			System.out.print(arr3[j]+" ");
		}
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("sorted array");
		SortArraySelectnSum ob=new SortArraySelectnSum();
		ob.Sort(arr3);
		ob.printArray(arr3);
		
		

	}

}
