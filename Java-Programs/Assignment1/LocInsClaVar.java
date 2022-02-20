//3. write a program to show the implemention of local, 
//Instance and class variables in a single program.

package Assignment1;

public class LocInsClaVar {
	int b=6;
	static int a=10;

	public static void main(String[] args) {
		
		
		int c=12;
		LocInsClaVar obj=new LocInsClaVar();
		
		
		System.out.println("value of local variable is " +c);
	
		
		
		System.out.println("value of class(static) variable is " +LocInsClaVar.a);
		System.out.println("value of instance variable is " +obj.b);
	}


}
