
//1. Write a program to input an array of string containing numbers, and to
//convert the string array to an integer array and perform the sum of all 
//the numbers.

package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class StrArrIntArr {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
        String str=s.next();
        String[] strArr=null;
        strArr=str.split("");
        System.out.println("string array  ");
        for (int i = 0; i< strArr.length; i++){  
        	System.out.print(strArr[i]+" ");  
        	}  
        System.out.println();
        System.out.println("-----------------------");
        int size=strArr.length;
        System.out.println("integer array");
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
	         arr[i] = Integer.parseInt(strArr[i]);
	      }
		System.out.println(Arrays.toString(arr));
	
		System.out.println("-------------------------------");
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("Sum of given array is "+ sum);
		 
	}

}
