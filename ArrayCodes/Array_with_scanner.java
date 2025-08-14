package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_with_scanner {

	public static void main(String[] args) {
		// WAP to accept the values of array at runtime in String data type
		
		Scanner s1 = new Scanner(System.in);				//create the object for scanner class to get the run time input
		
		System.out.println("Enter the size of the array: ");
		String[] name = new String[s1.nextInt()];				//Get the size of the array through human input
		
		for (int i = 0; i < name.length; i++)				//created the loop and used length variable for getting the length of name variable
		{
		
			System.out.println("Enter the value of next index: "+i);			//Printing msg to ask user to enter the next index value
			
			name[i] = s1.next();				//using nextint method to received the input from customer which will be saved in name variable
			
		}
		
		System.out.println(Arrays.toString(name));
		
		
		
		s1.close();
	}

}
