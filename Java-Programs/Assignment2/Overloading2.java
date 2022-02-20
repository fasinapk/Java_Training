//1.Write Two program to implement Method overloading in different ways.
//Create atleast 4 methods in one program through which
// method overloading can be implemented.


package Assignment2;

public class Overloading2 {
	static void add(int a,int b) {
		System.out.println(a+b);
	}
	static void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	static void add(double a,int b) {
		System.out.println(a+b);
	}
	static void add(double a,double b) {
		System.out.println(a+b);
	}
	static void add(int a,int b,double c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(12,5);
		add(70,5,25);
		add(140.565992,60);
		add(55.78512,15.545556);
		add(10,5,25.45512);

	}

}
