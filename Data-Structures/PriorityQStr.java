package DataStructures;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQStr {

	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("F");  
		queue.add("B");  
		queue.add("C");  
		queue.add("D");  
		queue.add("E");  
		System.out.println("Head:"+queue.element());  
		System.out.println("Head:"+queue.peek());  
		System.out.println("Iterating the queue elements:");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		queue.remove();  
		queue.poll();  
		System.out.println("After removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  

	}

}
