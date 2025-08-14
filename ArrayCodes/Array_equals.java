package array;

import java.util.Arrays;

public class Array_equals {

	public static void main(String[] args) {
		
		//WAP to check if 2 arrays are equals	-----> try by taking run time input

		int array1 [] = new int [4];
		int array2 [] = new int [4];
		
		array1 [0] = 12;
		array1 [1] = 24;
		array1 [2] = 36;
		array1 [3] = 48;
		
		array2 [0] = 12;
		array2 [1] = 24;
		array2 [2] = 36;
		array2 [3] = 48;
		
		
		boolean b1 = Arrays.equals(array1, array2);
		System.out.println(b1);
		
		if (b1 == true)
		{
			System.out.println("It is equal");
		}
		else
		{
			System.out.println("It is not");
		}
			
	}

}
