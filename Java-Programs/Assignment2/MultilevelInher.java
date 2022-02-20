//4. write a program to implement Multi-level inheritance. 
//Include atleast 3 classes.


package Assignment2;
class Vehicles{
	public void display() {
		System.out.println("Car class is invoked");
	}
}
class Car1 extends Vehicles{
	public void bmw() {
		System.out.println("BMW");
	}
}
class Car2 extends Car1{
	public void audi() {
		System.out.println("Audi");
	}
}
class Car3 extends Car2{
	public void benz() {
		System.out.println("Benz");
	}
}
class Car4 extends Car3{
	public void jaguar() {
		System.out.println("Jaguar");
	}
}
public class MultilevelInher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car4 car=new Car4();
		car.display();
		car.bmw();
		car.audi();
		car.benz();
		car.jaguar();
		

	}

}
