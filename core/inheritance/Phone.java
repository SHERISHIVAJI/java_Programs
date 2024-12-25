package core.inheritance;

public class Phone 
{
	String brand;
	String model;
	public Phone() {
		System.out.println("This is landline phone...!");
	}
	public Phone(String brand,String model)
	{
		this.brand=brand;
		this.model=model;
	}
	 public void displayDetails()
	 {
	        System.out.println("Brand: " + brand);
	        System.out.println("Model: " + model);
	 }
}
