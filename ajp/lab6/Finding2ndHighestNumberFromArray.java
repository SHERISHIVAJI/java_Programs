package ajp.lab6;
import java.util.Scanner;
/*
Declare an array with 10 elements. Get a subarray from an array between index 2 to 6 and find out the 2nd highest number from the sub array.

	Input: 2 4 5 3 6 7 9 4 5 6

	Output:
		Sub array: 5 3 6 7 9

		2nd Highest element: 7
 */
public class Finding2ndHighestNumberFromArray {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		//Input array declaration 
		int[] arr=new int[10];
		
		//elements of array
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<10;i++)
			arr[i]=input.nextInt();
		System.out.print("Input array is: ");
		for(int i=0;i<10;i++)
			System.out.print(arr[i]+" ");
		
		// Define the subarray range
        int startIndex = 2;
        int endIndex = 6;
        
        // Manually create the subarray from index 2 to 6 (inclusive)
        int[] subArray=new int[endIndex-startIndex+1];
        int index = 0;
        for(int i=startIndex;i<=endIndex;i++)
        	subArray[index++]=arr[i];
        
        //print the sub array elements
        System.out.print("Sub array is: ");
        for(int num:subArray)
        	System.out.print(num+" ");
        System.out.println();
        
        // Find the 2nd highest element in the subarray
        int secondHighest=findSecondHighest(subArray);
        
        //print the second highest element from the sub array
        System.out.println("2nd Highest element is: "+secondHighest);
      	input.close();
	}
	
    // Function to find the 2nd highest element in an array without using inbuilt methods
	public static int findSecondHighest(int arr[])
	{
		/*
		int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }

        return secondHighest;
        */
		int temp;
		for(int i=0;i<arr.length;i++)
			for(int j=i;j<arr.length;j++)
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
		int secondHighest=arr[arr.length-2];
		return secondHighest;
	}
}
