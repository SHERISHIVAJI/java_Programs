package core.variablesAndMethods;
//Instance variables in Java
class Product
{
	//instance variables
	long productId;
	String productName,productType;
	int productPrice;
	//instance method 
	void productDetails()
	{
		System.out.println("Product Details: \n"+"Id: "+productId+"\nName: "+productName+"\nType: "+productType+"\nPrice: "+productPrice);
	}
}
public class InstanceVar
{
	public static void main(String args[])
	{
		Product shirt=new Product();
		shirt.productId=357636116677l;
		shirt.productName="Shirt-Raymond";
		shirt.productType="Men's wear cloths";
		shirt.productPrice=2999;
		shirt.productDetails();
	}
}
