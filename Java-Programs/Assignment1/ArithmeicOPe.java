//1.Write a Java Program to initalise two variables and 
//perform all the Arithmetic operations on them and dsiplay their result.


package Assignment1;

public class ArithmeicOPe {

	public static void main(String[] args) {
		System.out.println("Arithmetic Operations");
		  int a,b,c,c1,c2,c3;
		  a=10;
		  b=2;
		  System.out.print("a is "+a);
		  System.out.println(" and b is "+b);
		  c=sum(a,b);
		  System.out.println("Sum of two no is "+c);
		  c1=diff(a,b); 
		  System.out.println("Difference is "+c1);
		  c2=mul(a,b);
		  System.out.println("Product is "+c2);
		  c3=div(a,b);
		  System.out.println("Division is "+c3);
		  
		 }
		 public static int sum(int x,int y)
		 {
		  int z=0;
		  z=x+y;
		  return z;
		 }
		 public static int diff(int x,int y)
		 {
		  int z=0;
		  z=x-y;
		  return z;
		 }
		 public static int mul(int x,int y)
		 {
		  int z=0;
		  z=x*y;
		  return z;
		 }
		 public static int div(int x,int y)
		 {
		  int z=0;
		  z=x/y;
		  return z;

	}

}
