//1.Write Two program to implement Method overloading in different ways.
//Create atleast 4 methods in one program through which
// method overloading can be implemented.


package Assignment2;

public class Overloading1 {
	static void display(int a) {
		System.out.println("integer : "+a);
	}
	static void display(double a) {
		System.out.println("double : "+a);
	}
	static void display(char a) {
		System.out.println("character : "+a);
	}
	static void display(String a) {
		System.out.println("boolean : "+a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(5);
		display(12.2);
		display('2');
		display("hello");
		
		

	}

}
