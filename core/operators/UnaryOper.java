package core.operators;
//Unary Operators in Java
class UnaryOper
{
	public static void main(String args[])
	{
		int num1=10;
		int num2;
		System.out.println(num1);
		num2=++num1;
		System.out.println(num1+" "+num2);
		num2=num1++;
		System.out.println(num1+" "+num2);
		System.out.println(num1+" "+num2);
		byte b=5;
		b=(byte)(b+50);
		System.out.println(b);
		num2=--num1;
		System.out.println(num1+" "+num2);
		num2=num1--;
		System.out.println(num1+" "+num2);
		char ch='a';
		char x=++ch;
		System.out.println(ch+" "+(++ch)+" "+(--ch)+" "+(x+ch));
	}
}

