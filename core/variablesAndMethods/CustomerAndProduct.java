package core.variablesAndMethods;

//Producer and consumers
import java.util.Scanner;
class Products
{
	Scanner input=new Scanner(System.in);
	String name;
	private long id;
	void setProductDetails()
	{	
		System.out.print("Enter product name: ");
		name=input.next();
		System.out.print("Enter product Id: ");
		id=input.nextLong();
	}
	void getProductDetails()
	{
		System.out.println("Product Details:");
		System.out.println("Name: "+name);
		System.out.println("Producer Id: "+id);
	}
}
class Customer
{
	Scanner input=new Scanner(System.in);
	String name;
	private long customerId;
	String email;
	private String password;
	void setCustomerDetails()
	{
		System.out.print("Enter customer name: ");
		name=input.next();
		System.out.print("Enter customer Id: ");
		customerId=input.nextLong();
		System.out.print("Enter customer email: ");
		email=input.next();
		System.out.print("Enter customer password: ");
		password=input.next();
	}
	void getCustomerDetails()
	{
		System.out.println("Customer details: ");
		System.out.println("Name: "+name);
		System.out.println("Producer Id: "+customerId);
		System.out.println("Email: "+email);
		System.out.println("Password: "+password);
	}
}

public class CustomerAndProduct
{
	public static void main(String args[])
	{
		Customer customer=new Customer();
		customer.setCustomerDetails();
		customer.getCustomerDetails();
		Products product=new Products();
		product.setProductDetails();
		product.getProductDetails();
	}
}