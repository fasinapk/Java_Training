package DataStructures;

import java.util.Hashtable;
//This creates a hash table that has an initial size 
//specified by initialCapacity
//and the default load factor is 0.75.
public class HashTable2 {

	public static void main(String[] args) {
		// No need to mention the
        // Generic type twice
        Hashtable<Character, Integer> ht1 = new Hashtable<>(4);
  
        // Initialization of a Hashtable
        // using Generics
        Hashtable<Character, Integer> ht2
            = new Hashtable<Character, Integer>(2);
  
        // Inserting the Elements
        // using put() method
        ht1.put('a', 1);
        ht1.put('b', 2);
        ht1.put('c', 3);
  
        ht2.put('d', 4);
        ht2.put('e', 5);
        ht2.put('f', 6);
  
        // Print mappings to the console
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);

	}

}
