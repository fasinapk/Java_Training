//2.Write a Java Program to initalise two global 
//static variables and to display the greatest of them.


package Assignment1;

public class TwoGlobalStaticVar {
	
	static int a=1;
	static int b=8;

	public static void main(String[] args) {
		System.out.println("a=" +a);
		  System.out.println("b=" +b);
		  if(a>b)
		  {
		    System.out.print("a is greatest");
		  }
		  else
		  {
		   System.out.print("b is greatest");
		  }

	}

}
