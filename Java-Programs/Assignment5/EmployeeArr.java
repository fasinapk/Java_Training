//5. Write a program to input the following details:
//i)Employee Name
//ii)Employee Salary
//iii)Employee Year of joining

//Calculate the Loyalty bonus of the Employee's by
//a)if the year of their joining is on or before than 2017,
//and their Salary is more than 30000/-,
//then the bonus will be 22% of the salary.


package Assignment5;

import java.util.Scanner;

public class EmployeeArr {
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array : ");
		int size=sc.nextInt();
		String[] name=new String[size];
		int[] salary=new int[size];
		int[] yoj=new int[size];
		System.out.println("enter the details of employees");
		System.out.println("--------------------------------");
		for(int i=0;i<size;i++)
		{
			System.out.print("enter the name of employee "+(i+1)+" : ");
			name[i]=sc.next();
			System.out.print("enter the salary of employee "+(i+1)+" : ");
			salary[i]=sc.nextInt();
			System.out.print("enter the year of joining of employee "+(i+1)+" : ");
			yoj[i]=sc.nextInt();
			System.out.println("--------------------------------");
		}
		
		System.out.println("Loyalty bonus of employee's");
		int[] bonus=new int[size];
	
		for(int i=0;i<size;i++)
		{
			if(yoj[i]<=2017 && salary[i]>30000)
			{
				bonus[i]=(salary[i])*22/100;
				System.out.println("a) bonus of " +name[i]+ " = "+bonus[i]);
			}
			else if(yoj[i]<=2017 && salary[i]<30000)
			{
				bonus[i]=(salary[i])*33/100;
				System.out.println("b) bonus of " +name[i]+ " = "+bonus[i]);
			}
			else if(yoj[i]<=2012)
			{
				bonus[i]=(salary[i])*40/100;
				System.out.println("c) bonus of " +name[i]+ "= "+bonus[i]);
			}
			else if(yoj[i]>2017 && salary[i]<30000)
			{
				bonus[i]=(salary[i])*15/100;
				System.out.println("d) bonus of " +name[i]+ "= "+bonus[i]);
			}
			else if(yoj[i]>2017 && salary[i]>30000)
			{
				bonus[i]=(salary[i])*10/100;
				System.out.println("e) bonus of " +name[i]+ " = "+bonus[i]);
			}
			else {System.out.println("no conditions satisfied");}
		}

	}

}
