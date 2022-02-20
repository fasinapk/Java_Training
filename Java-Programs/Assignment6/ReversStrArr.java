//3.Write a program to take input of a String and convert it into a character
// array and reverse the array, and to again make that reversed 
//character array as a String and display it.

package Assignment6;

import java.util.Scanner;

public class ReversStrArr {

	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		System.out.print("enter string : ");
//		String s1=s.next();
//		char[] c=s1.toCharArray();
//		System.out.println("Character arrays are");
//		for(int i=0;i<c.length;i++)
//		{
//			System.out.print(c[i]+",");
//		}
//		System.out.println();
//		System.out.println("---------------------------");
//		
//		System.out.println("Reversed array ");
//		for(int i=c.length-1;i>=0;i--)
//		{
//			System.out.print(c[i]+",");			
//			
//		}
//		char ch;
//		String rev="";
//		for(int i=0;i<s1.length();i++)
//		{
//			ch=s1.charAt(i);
//			rev=ch+rev;		
//		}
//		
//		System.out.println();
//		System.out.println("Reversed chrctr array to string "+rev);
		
		  int i,j;
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the String");
		    String s1 = sc.next();
		    char[] arr = s1.toCharArray();
		    char[] arr2 = new char[arr.length];
		    j=arr.length-1;
		    for(i=0;i<arr.length;i++)
		      {
		      arr2[i]=arr[j];
		      j--;
		      }
		    System.out.println("The elements in Reversed string array are: ");
		    for(i=0;i<arr2.length;i++)
		    {
		      System.out.print(arr2[i]+" ");
		    }  System.out.println();
		    StringBuilder s = new StringBuilder();
		    for (i = 0; i < arr2.length; i++)
		    {
		      s.append(arr2[i]);
		    }
		    String reversed = s.toString();
		    System.out.println("The reversed array in string format is "+reversed);


	}

}
