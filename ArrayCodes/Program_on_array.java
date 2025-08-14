package array;

import java.util.Arrays;

public class Program_on_array 
{
	public static void main(String[] args) 
	{	
		//Basic Program of array
		
		String [] a1 = new String[4];		//Declaring		//This is syntax of array: data type [] variable/array name = new data type [size]
		
		a1 [0] = "Excuses";					//initializing
		a1 [1] = "Don't";
		a1 [2] = "Get";
		a1 [3] = "Results";
		
		for (int i = 0; i < a1.length; i++)   //a.length ---->> the length is size. for ex: [4]
		{
			System.out.println(a1[i]);			// variable [index]
		}
		
		System.out.println(Arrays.toString(a1));    //used to convert an array to a human-readable string format.
	}

}
