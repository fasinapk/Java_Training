package DataStructures;

import java.util.Stack;

public class StackDouble {

	public static void main(String[] args) {  
		Stack<Double> stk= new Stack<>();  
		boolean result = stk.empty();  
		System.out.println("Is the stack empty? " + result);  
		stk.push(16.1235);  
		stk.push(23.113);  
		stk.push(12.920);  
		stk.push(1.620);  
		System.out.println("Elements in Stack: " + stk);  
		stk.pop();
		System.out.println("The last element is "+stk.peek());
		System.out.println("The position of 16.1235 in the stack is "+stk.search(12.920));
				

	}

}
