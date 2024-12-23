package core.operators;

//Bitwise operators in Java
class BitwiseOper
{
	public static void main(String args[])
	{
		int a=10,b=20;
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~a);
		System.out.println(~b);
		System.out.println(a<<2);
		System.out.println(b<<2);
		System.out.println(a>>3);
		System.out.println(b>>3);
		System.out.println(a>>>3);
	}
}
