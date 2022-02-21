

//2.Write a program to input a double dimentional array of String in the 
//following manner:

//i)the names of students
//ii)the their total marks 

//and to check if the Student has passed if he has more than 400 marks, 
//else print the student has failed.
//ex:
//|Adithya, Jhon, Abdul|
//|600, 350, 500| 

package Assignment;

import java.util.Scanner;

public class TwoDStr {

	public static void main(String[] args) {
		System.out.println("enter rows and column size of two arrays");
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		int col=s.nextInt();
		

		String[][] name=new String[row][col];
		String[][] mark=new String[row][col];
		System.out.println("enter the details of student");
		System.out.println("--------------------------------");
	
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print("enter the name of student "+(i+1)+" : ");
				name[i][j]=s.next();
				System.out.print("enter the mark of student"+(i+1)+" : ");
				mark[i][j]=s.next();
			}
		}
		System.out.println("--------------------------------");
		System.out.println("student details");
		System.out.print("|");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(name[i][j]+",");
				

			}
		}
		System.out.print("|");
		System.out.println();
		
		System.out.print("|");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{

				System.out.print(mark[i][j]+",");
				
			}
		}
		System.out.print("|");
		
		System.out.println();
		System.out.println("--------------------------------");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				String a=mark[i][j];
				int m=Integer.parseInt(a);
				
			
				if(m>400)
					System.out.println("Student "+name[i][j]+" passed");
				else
					System.out.println("Student "+name[i][j]+" failed");
				
			}
		}

	}

}
