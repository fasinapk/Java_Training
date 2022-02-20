//4.A company decided to give bonus of 5% to employee if his/her year of 
//service is more than 5 years.
//Ask user for their salary and year of service and print the net bonus
//amount. Note- create a method EmployeeBonus to calculate the bonus and return it.




package Assignment4;

import java.util.Scanner;

public class Employee {
	public static int EmployeeBonus(int s) {
		int net_bonus=s+(s)*5/100;
		return net_bonus;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Salary ");
		int salary=s.nextInt();
		System.out.println("Enter Year of service");
		int year=s.nextInt();
		
		int res=EmployeeBonus(salary);
		
		if(year>5)
			System.out.println("You are eligible and salary bonus is "+res);
		else
			System.out.println("you are not eligible for bonus");

	}

}
