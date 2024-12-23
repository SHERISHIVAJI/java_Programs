package core.variablesAndMethods;

//Static variables in Java
class ProductDetails
{
	//instance variables
	long productId;
	String productName,productType;
	int productPrice;
	//static variable
	static String brandName="Raymond";
	//instance method 
	void productDetails()
	{
		System.out.println("\nProduct Details: \n"+"Id: "+productId+"\nName: "+productName+"\nType: "+productType+"\nPrice: "+productPrice+"\nBrand: "+brandName);
	}
	static void getBrand()
	{
		System.out.println("\nBrand Name: "+brandName);
	}
}
public class StaticVar
{
	public static void main(String args[])
	{
		ProductDetails p1=new ProductDetails();
		p1.productDetails();

		p1.productId=357636116677l;
		p1.productName="Shirt";
		p1.productType="Men's wear cloths";
		p1.productPrice=2999;
		p1.brandName="Addidas";
		p1.productDetails();

		ProductDetails.brandName="Nike";
		ProductDetails.getBrand();

		ProductDetails p2=new ProductDetails();
		p2.productId=77667567798787l;
		p2.productName="Jacket";
		p2.productType="Cloths";
		p2.productPrice=1999;
		p2.brandName="Denim";
		p2.productDetails();

		p1.productDetails();
		ProductDetails.getBrand();
		p2.productDetails();
	}
}
