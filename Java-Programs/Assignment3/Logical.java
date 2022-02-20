//4. Write a java program to evaluate two statements each 
//using Logical OR and Logical And operator.


package Assignment3;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12,b=5,c=5;
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		
		//AND operator
		
		System.out.println("AND operator");
		if((a>b)&&(b==c)) {
			System.out.println("condition true: a>b and b==c");
		}
		//System.out.println(4>2 && 2<6);
		
		//OR operator
		
		System.out.println("OR operator");
		if((b<a)||(b!=c)) {
			System.out.println("condition true: b<a or b!=c");
		}
		
		//System.out.println(4>2 || 12<6);
		
		
		
		

	}

}
