
//2.Write a java program to implement an interface with two methods.


package Assignment3;

interface Vehicles{
	void run();
	void model();
}

class Car implements Vehicles{
	public void run() {
		System.out.println(" car : running...");
	}
	public void model() {
		System.out.println(" car : model...");
	}
}

class Bike implements Vehicles{
	public void run() {
		System.out.println(" bike : running...");
	}
	public void model() {
		System.out.println(" bike : model...");
	}
}
public class Interfacee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicles v=new Bike();
		v.run();
		v.model();

	}

}
