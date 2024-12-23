package core.variablesAndMethods;

//Write a program to convert temperature from degree celsius to Fahrenheit
import java.util.Scanner;
class ConvertTempFromCelsiusToFahrenheit
{
	void convert()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the temperature in celsius ");
		float tempInCelsius=input.nextFloat();
		float tempInFahrenheit=(tempInCelsius*9/5)+32;
		System.out.print("Temperature converted from "+tempInCelsius+"°C to "+tempInFahrenheit+"°F");
	}
	public static void main(String args[])
	{
		ConvertTempFromCelsiusToFahrenheit obj=new ConvertTempFromCelsiusToFahrenheit();
		obj.convert();
	}
}