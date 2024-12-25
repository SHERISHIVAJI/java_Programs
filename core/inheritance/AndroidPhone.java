package core.inheritance;

public class AndroidPhone extends SmartPhone
{
    String androidVersion;
    
    public AndroidPhone() 
    {
    	System.out.println("This is Android Version of Smart Phone...!!!");
    }
    public AndroidPhone(String brand, String model, boolean hasTouchscreen, String androidVersion)
    {
        super(brand, model, hasTouchscreen);
        this.androidVersion = androidVersion;
    }
    public void displayAndroidPhoneDetails() {
        displaySmartphoneDetails();
        System.out.println("Android Version: " + androidVersion);
    }
    
    public static void main(String args[])
    {
    	//Object without parameters
    	AndroidPhone ap1 = new AndroidPhone();
    	System.out.println("\nDisplaying features before assining the values.....");
    	ap1.displayAndroidPhoneDetails();
    	
    	//Object with parameters
    	AndroidPhone ap2 = new AndroidPhone("Samsung","Gakaxy S21",true,"Android 13");
    	System.out.println("\nDisplaying features before assining the values.....");
    	ap2.displayAndroidPhoneDetails();
	}
}
