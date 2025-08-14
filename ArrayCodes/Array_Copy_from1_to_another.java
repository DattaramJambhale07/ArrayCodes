package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Copy_from1_to_another {

	public static void main(String[] args) 
	{
		// WAP to copy one array into another array
		
		Scanner s1 = new Scanner (System.in);
		System.out.println("Enter the size of the array:");
		
		int [] input = new int [s1.nextInt()];
		
		for (int i = 0; i < input.length; i ++)
		{
			System.out.println("Enter the Input Values: "+i);
			input [i] = s1.nextInt();	
		}
		
		int [] output = new int [input.length];
		
		for (int i = 0; i < input.length; i++)
		{
			output [i] = input [i];
		}
		
		System.out.println("Input: "+Arrays.toString(input));
		System.out.println("output: "+Arrays.toString(output));
	
		s1.close();
	}

}
