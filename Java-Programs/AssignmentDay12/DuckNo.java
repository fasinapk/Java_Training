//2. Program to find out if a particular number is a duck number.

//duck no: positive number which has zeroes present in it. eg:210120,210
// no zero at begining eg:035 or 0012 are not considered as Duck Numbers.

package Assignment12;

import java.util.Scanner;

public class DuckNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a No ");
		String s=sc.next();
		
		
		int n=0;
		char c;
		
		for(int i=1;i<s.length();i++)
		{
			c=s.charAt(i);
			if(c=='0')
				n++;
		}
		
		char f=s.charAt(0);
		
		if(n>0&&f!='0')
			System.out.println("Duck number"); 
        else
            System.out.println("Not a duck number");
		

	}

}
