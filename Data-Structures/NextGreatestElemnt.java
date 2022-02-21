package DataStructures;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextGreatestElemnt {

	public static void main(String[] args) {
		System.out.println("enter the size of array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();	
		
		int[] arr=new int[size];
		int[] res=new int[arr.length];
		
		System.out.println("enter array elements");
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("array elements are");
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
		
		Stack<Integer> s= new Stack<>();
		
		for(int i=arr.length-1;i>=0;i--)
		{
			if(!s.empty())
			{
				while(!s.empty()&&s.peek()<=arr[i])
					s.pop();
			}
			res[i]=s.empty()?-1:s.peek();
			s.push(arr[i]);
		}
		
		System.out.println();
		System.out.println("next greatest elements are");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]+" --> "+res[i]);
	}

}
