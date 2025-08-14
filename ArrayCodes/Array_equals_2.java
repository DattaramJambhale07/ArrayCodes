package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_equals_2 {

	public static void main(String[] args)
	{

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the size of the input array:");
		
		int [] input = new int [s1.nextInt()];
		
		for ( int i = 0; i < input.length; i++)
		{
			System.out.println("Enter the value of next index: "+i);

			input [i] = s1.nextInt();
		}
		
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the size of the output array:");
		int [] output = new int [s2.nextInt()];
		
		for (int i = 0; i < output.length; i++)
		{
			System.out.println("Enter the value of next index: "+i);
			
			output [i] = s2.nextInt();
		}
		
		boolean b1  =  Arrays.equals(input, output);
		
		if(b1)
		{
			System.out.println("2 arrays are equals");
			
		}
		else
		{
			System.out.println("2 arrays aren't equals");
		}
		s1.close();
		s2.close();
	}

}
