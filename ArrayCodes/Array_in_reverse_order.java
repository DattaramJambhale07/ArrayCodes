package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_in_reverse_order {

	public static void main(String[] args) {
		// WAP to copy one array into another array in reverse order
		
		Scanner s1 = new Scanner (System.in);
		System.out.println("Enter the size of the Array: ");
		int [] input = new int[s1.nextInt()];
		
		for (int i = 0; i < input.length; i++)
		{
			System.out.println("Enter the value od Index: "+i);
			input [i] = s1.nextInt();
		}
		
		int [] out = new int[input.length];

		for(int i = input.length-1, j = 0; i >= 0; i--, j++)
		{
			
			out[j] = input [i];
		}
		
		System.out.println("Input: "+Arrays.toString(input));
		System.out.println("Ouput: "+Arrays.toString(out));
		
	
		

		
		
		s1.close();
	
	}

}
