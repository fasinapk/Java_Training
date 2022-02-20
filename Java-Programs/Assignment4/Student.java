//3.A student will not be allowed to sit in exam if his/her attendence 
//is less than 75%.

//Take following input from user
//Number of classes held
//Number of classes attended.
//And print
//percentage of class attended
//Is student is allowed to sit in exam or not.




package Assignment4;

import java.util.Scanner;

public class Student {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float attended_class,total_class,percentage; 
		
		Scanner s=new Scanner(System.in);
	
		System.out.println("Number of classes attended  ");
		attended_class=s.nextInt();
		
		
		System.out.println("Number of classes held ");
		total_class=s.nextInt();
		
		
		percentage=(attended_class/total_class)*100;
		
		System.out.println("Student Attendence is "+percentage + "%");
		
		
		if(percentage>=75)
			System.out.println("student is allowed to sit in exam");
		
		else
			System.out.println("student is not allowed to sit in exam ");
			
		
		
		
		
		
		

	}

}
