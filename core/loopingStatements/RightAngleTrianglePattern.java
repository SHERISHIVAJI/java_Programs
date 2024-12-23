package core.loopingStatements;

import java.util.Scanner;

public class RightAngleTrianglePattern
{

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size=in.nextInt();
		int row=1;
		while(row<=size)
		{
			int col=1;
			while(col<=row)
			{
				System.out.print("*");
				if(col<row)
					System.out.print(" ");
				col++;
			}
			System.out.println();
			row++;
		}
	}

}
