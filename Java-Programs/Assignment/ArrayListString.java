//3.Create two arraylist of strings to take First_name and Last_name of the
//students, and print their whole name.

package Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListString {

	public static void main(String[] args) {
//		ArrayList<String> fn=new ArrayList<String>();
//		ArrayList<String> ln=new ArrayList<String>();
//		
//		//first name
//		fn.add("Raju");
//		fn.add("Appu");
//		fn.add("Ammu");
//		System.out.println("First name are "+fn);
//		
//		//last name
//		ln.add("MV");
//		ln.add("KK");
//		ln.add("N");
//		System.out.println(" Last name are "+ln);
//		
//		System.out.println("----------------------------------");
//		System.out.println("Full name of the students are");
//		System.out.println(fn.get(0)+" "+ln.get(0));
//		System.out.println(fn.get(1)+" "+ln.get(1));
//		System.out.println(fn.get(2)+" "+ln.get(2));
		
		ArrayList<String> first_name = new ArrayList<String>();
		first_name.add("Lijin");
		first_name.add("Vipin");
		first_name.add("Akhil");
		System.out.println("First name is ="+first_name);
		
		ArrayList<String> second_name = new ArrayList<String>();
		second_name.add("Joy");
		second_name.add("Kumar");
		second_name.add("Suresh");
		System.out.println("Second name is ="+second_name);
		
		ArrayList<String> total= new ArrayList<String>();
		
		for(int i=0; i<first_name.size();i++) {
			
			total.add(first_name.get(i)+" "+second_name.get(i));
		}
		
		System.out.println("Full name is :");
		System.out.println("");
		
		for (String fullname : total) {
			System.out.println(fullname);
		}


	}

}
