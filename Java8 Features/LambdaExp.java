package Java8Features;

@FunctionalInterface//optional
interface MyInterface{
public void myMethod();
}
public class LambdaExp{
	public static void main(String args[]){
		int variable =10;
		//implemenmtation with lambda expression
		MyInterface myInterface=()->{
			System.out.println("variable = "+variable);
		};
		myInterface.myMethod();
	}
}
