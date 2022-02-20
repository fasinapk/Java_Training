//1.a) Write a program to use a Ternary operator and find the greatest 
//of three numbers.


package Assignment3;

public class TernaryLarg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int largest,a=2,b=15,c=8;
		largest=a>b?(a>c?a:c):(b>c?b:c);
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
        System.out.println("largest is "+ largest);
	}

}
