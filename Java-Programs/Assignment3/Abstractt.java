//3.Write a java program to implement an abstract class with two
// abstract methods and one non-abstract method.



package Assignment3;

abstract class Vehicle{
	abstract void model();
	abstract void speed();
	
	void engine() {
		System.out.println("engine method is invoked...");
	}
}
class Audii extends Vehicle{
	void model() {
		System.out.println("the model method is invoked");
	}
	void speed() {
		System.out.println("the speed method is invoked");
	}


}
public class Abstractt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new Audii();
		v.engine();
		v.model();	
		v.speed();

	}

}
