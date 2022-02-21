//3. Program to find if a particular number is a Strong number.


//strong no:sum of the factorial of digits is equal to the original number

package Assignment12;

import java.util.Scanner;

public class StrongNo {

	public static void main(String[] args) {
		int n,i;
		int fact,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a No ");
		n=sc.nextInt();
		
		int sum=0;
		int temp=n;
		
		while(n!=0)
		{
			i=1;
			fact = 1;
			rem = n % 10;
			while(i <= rem)
			{
			fact = fact * i;
			i++;
			}
			sum = sum + fact;
			n = n / 10;	
		}
		
		if(sum == temp)
			System.out.println(temp + " is a strong number\n");
			else
			System.out.println(temp + " is not a strong number\n");

			System.out.println();
		
		
		

	}

}
