package core.variablesAndMethods;

//Program demonstrating different type of methods
public class TypesOfMethods
{
	int num1,num2;

	//method without return type and parameters
	void sum()
	{
		int sum=num1+num2;
		System.out.println("Sum= "+sum);
	}

	//method with return type and without parameters
	int sub()
	{
		int sub=num1-num2;
		return sub;
	}

	//method without return type and with parameters
	void product(int a,int b)
	{
		int product=a*b;
		System.out.println("Product= "+product);
	}

	//method with return type and parameters
	int division(int a,int b)
	{
		int quotient=a/b;
		return quotient;
	}
	public static void main(String args[])
	{
		TypesOfMethods tom=new TypesOfMethods();
		tom.num1=63;
		tom.num2=62;
		tom.sum();
		int sub=tom.sub();
		System.out.println("Sub= "+sub);
		tom.product(76,9);
		System.out.print("Quotient= "+tom.division(36,6));
	}
}