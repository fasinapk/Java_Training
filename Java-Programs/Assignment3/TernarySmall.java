//1.b) Write a program to use a Ternary operator and find the 
//smallest of three numbers.
//

package Assignment3;

public class TernarySmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int smallest,a=9,b=6,c=18;
		
		smallest=a<b?(a<c?a:c):(b<c?b:c);
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		
        System.out.println("smallest is "+ smallest);

	}

}
