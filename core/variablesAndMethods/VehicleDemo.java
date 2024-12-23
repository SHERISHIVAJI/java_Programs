package core.variablesAndMethods;

//classes and object
class Vehicle
{
	int speed;
	int capacity;
	int wheels;
	String name;
	void vehicleProperties()
	{
		System.out.println("Name: "+name+"\nSpeed: "+speed+"\nCapacity: "+capacity+"\nWheels: "+wheels);
	}
}
public class VehicleDemo
{
	public static void main(String args[])
	{
		Vehicle car=new Vehicle();
		car.name="Benz";
		car.speed=250;
		car.wheels=4;
		car.capacity=5;
		car.vehicleProperties();
	}
}