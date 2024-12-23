package core.operators;

//Ternary operator in Java
class TernaryOper
{
	public static void main(String args[])
	{
		int a=10,b=20,c=30;
		int res=a>b? a>c? a : c : b>c? b : c;
		System.out.println(res);
	}
}