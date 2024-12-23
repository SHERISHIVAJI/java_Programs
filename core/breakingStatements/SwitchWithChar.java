package core.breakingStatements;

//switc-case with character
import java.util.Scanner;
class SwitchWithChar
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a character to check whether it is vowel or not: ");
		char letter=in.next().charAt(0);
		switch(letter)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println(letter+" is a vowel character");
				break;
			default:
				System.out.println(letter+" is not a vowel but it is an ASCI character");
		}
	}
}

			
