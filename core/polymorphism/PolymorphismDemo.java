package core.polymorphism;
//static polymorphism
public class PolymorphismDemo 
{
	void message()
	{
		System.out.println("Good morning");
	}
	void message(String str) 
	{
		System.out.println("Hello "+str);
	}
	void message(String str1,String str2)
	{
		System.out.println("This is "+str1+"-"+str2);
	}
	public static void main(String[] args) 
	{
		PolymorphismDemo pd=new PolymorphismDemo();
		pd.message();
		pd.message("Shivaji");
		pd.message("Shivaji","21Q61A05D0");
	}
}
