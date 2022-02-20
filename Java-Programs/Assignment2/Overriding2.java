//2.Write Two program to implement Method overriding.Create 
//Two parent classes with two methods each , which are overridden.


package Assignment2;
class Sample{
	void display() {
		System.out.println("hello");
	}
	void add() {
		
		System.out.println("no sum");
	
	}
}
class Test1 extends Sample{
	void display() {
		System.out.println("hello test1");
	}
	void add() {
		int a,b;
		a=10;
		b=5;
		System.out.println("sum of 2:");
		System.out.println(a+b);
	}
}
class Test2 extends Sample{
	void display() {
		System.out.println("hello test2");
	}
	void add() {
		int a,b,c;
		a=10;
		b=5;
		c=5;
		System.out.println("sum of 3:");
		System.out.println(a+b+c);
	}
}
public class Overriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s;
		s=new Sample();
		s.display();
		s.add();
		s=new Test1();
		s.display();
		s.add();
		s=new Test2();
		s.display();
		s.add();
		

	}

}
