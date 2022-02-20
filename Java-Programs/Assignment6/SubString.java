//1.Write a program to take two strings as an input from the user
// and check if the second one is a substring of the first.
 
package Assignment6;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string 1 : ");
		String s1=s.next();
		System.out.println("enter string 2 : ");
		String s2=s.next();
		
		
		if(s1.contains(s2)) {
			System.out.println(s2+" substring of "+s1);
		}
		else {
			System.out.println(s2+" not a substring of "+s1);
		}
		
	
		
		
		
		

	}

}
