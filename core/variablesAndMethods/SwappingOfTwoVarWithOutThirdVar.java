package core.variablesAndMethods;

//Write a program to swap 2 numbers without using 3rd variable
class SwappingOfTwoVarWithOutThirdVar
{
	void swap()
	{
		int num1=10,num2=20;
		System.out.println("Before swapping: "+num1+" "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After swapping: "+num1+" "+num2);
	}
	public static void main(String args[])
	{
		SwappingOfTwoVarWithOutThirdVar obj=new SwappingOfTwoVarWithOutThirdVar();
		obj.swap();
	}
}
