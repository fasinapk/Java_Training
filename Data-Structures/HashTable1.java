package DataStructures;

import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {
		// No need to mention the
        // Generic type twice
        Hashtable<Character, String> ht1 = new Hashtable<>();
  
        // Initialization of a Hashtable
        // using Generics
        Hashtable<Character, String> ht2
            = new Hashtable<Character, String>();
  
        // Inserting the Elements
        // using put() method
        ht1.put('a', "one");
        ht1.put('b', "two");
        ht1.put('c', "three");
  
        ht2.put('d', "four");
        ht2.put('e', "five");
        ht2.put('f', "six");
  
        // Print mappings to the console
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);

	}

}
