//2.Create a arraylist of integers and find the sum and average of the 
//entire list.

package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInteger {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.print("enter no of elements : ");
		int n=s.nextInt();
		System.out.println("enter elements ");
		for(int i=0;i<n;i++)
			l.add(s.nextInt());
		
//		l.add(4);
//		l.add(1);
//		l.add(5);
//		l.add(2);
//		l.add(7);
//		l.add(3);
//		l.add(6);
		
		System.out.println("Array list : "+l);
		int sum=0,avg;
		for(int i=0;i<l.size();i++)
		{
			sum+=l.get(i);			
		}
		System.out.println("sum = "+sum);
		avg=sum/n;
		System.out.println("average ="+avg);		
	}
}
