package oopspkg;

abstract class Vehicle
{
	abstract public void acceleration();
	abstract public void speed();
	
	public void engine()
	{
		System.out.println("Engine");
	}
}
class Car extends Vehicle
{

	@Override
	public void acceleration() {
		System.out.println("Car acceleration");
		
	}

	@Override
	public void speed() {
		System.out.println("Car Speed");
		
	}	
}
class Bike extends Vehicle
{

	@Override
	public void acceleration() {
		System.out.println("Bike acceleration");
		
	}

	@Override
	public void speed() {
		System.out.println("Bike Speed");
		
	}	
}

public class Abstractionprogram {

	public static void main(String[] args) {
		Car ob=new Car();
		ob.acceleration();
		ob.engine();
		ob.speed();
		Bike b=new Bike();
		b.acceleration();
		b.engine();
		b.speed();

	}

}


	

