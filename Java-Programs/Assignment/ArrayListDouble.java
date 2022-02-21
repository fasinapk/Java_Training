//1.Write a program to create a arraylist of double element and add the elements.
//sort the elements in descending order and print it.

package Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDouble {

	public static void main(String[] args) {
		ArrayList<Double> s=new ArrayList<Double>();
		s.add(45.01);
		s.add(56.23659);
		s.add(21.231);
		s.add(96.2356);
		s.add(2.013);
		s.add(11.23);
		System.out.println("Before Sorting : " + s);
		
		System.out.println("----------------------------------");
		Collections.sort(s,Collections.reverseOrder());
		System.out.println("After Sorting : " + s);
		
		
		
		

	}

}
