//2.Write Two program to implement Method overriding.Create 
//Two parent classes with two methods each , which are overridden.


package Assignment2;

class Animal{
	void eat() {
		System.out.println("eating..");
	}
	void run() {
		System.out.println("running..");
	}
}
class Cat extends Animal{
	void eat() {
		System.out.println("cat eating..");
	}
	void run() {
		System.out.println("cat running..");
	}
} 
class Birds{
	void fly() {
		System.out.println("flying..");
	}
	void sound() {
		System.out.println("singing..");
	}
}
class Parrot extends Birds{
	void fly() {
		System.out.println("parrot flying..");
	}
	void sound() {
		System.out.println("parrot singing..");
	}
} 
public class Overriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Cat();
		a.run();
		a.eat();
		
		Birds b=new Parrot();
		b.fly();
		b.sound();



	}

}



