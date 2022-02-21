package DataStructures;

import java.util.Hashtable;

public class HashTableAdd {

	public static void main(String[] args) {
		
		// No need to mention the
		// Generic type twice
		Hashtable<Double, Character> ht1 = new Hashtable<>();

		// Initialization of a Hashtable
		// using Generics
		Hashtable<Double, Character> ht2
			= new Hashtable<Double, Character>();

		// Inserting the Elements
		// using put() method
		ht1.put(0.1, 'G');
		ht1.put(0.2, 'F');
		ht1.put(0.3, 'G');

		ht2.put(0.1, 'G');
		ht2.put(0.2, 'F');
		ht2.put(0.3, 'G');
				
		// Print mappings to the console
		System.out.println("Mappings of ht1 : " + ht1);
		System.out.println("Mappings of ht2 : " + ht2);

	}

}
