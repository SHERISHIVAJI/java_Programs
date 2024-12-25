package core.inheritance;

public class SmartPhone extends Phone 
{
	boolean hasTouchscreen;
	public SmartPhone()
	{
		System.out.println("This is Smart Phone...!!");
	}
	public SmartPhone(String brand,String model,boolean hasTouchscreen)
	{
		super(brand,model);
		this.hasTouchscreen=hasTouchscreen;
	}
	public void displaySmartphoneDetails()
	{
        displayDetails();
        System.out.println("Has Touchscreen: " + (hasTouchscreen ? "Yes" : "No"));
    }
}
