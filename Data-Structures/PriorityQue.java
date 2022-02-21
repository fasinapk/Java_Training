package DataStructures;
//The elements in a PriorityQueue do not follow any particular order, except for the 
//head which is the smallest element. In particular, iteration order is not defined.
//If you continuously  remove from the queue you will get the elements in natural order.

import java.util.PriorityQueue;

public class PriorityQue {

	public static void main(String[] args) {
		// Creating empty priority queue
        PriorityQueue<Integer> p = new PriorityQueue<Integer>();
  
        // Adding items to the pQueue using add()
        p.add(25);
        p.add(14);
        p.add(9);
        p.add(1);
        p.add(3);
        System.out.println("elements : "+p);
  
        // Printing the top element of PriorityQueue
        System.out.println("top element : "+p.peek());
  
        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println("top element which we are going to remove : "+p.poll());
  
        // Printing the top element again
        System.out.println("top element : "+p.peek());

	}

}
