package array;

import java.util.Arrays;

public class Array_ANAGRAM {

	public static void main(String[] args) 
	
	{
		//WAP to check if the given 2 strings are ANAGRAM

		String s1 = "ANAGRAM";
		String s2 = "GRAMANA";
		
		if (s1.length() != s2.length())
		{
			System.out.println("They are not ANAGRAM");
		}
		else
		{
			char [] c1 = s1.toCharArray();
			char [] c2 = s2.toCharArray(); 
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			boolean b2 = Arrays.equals(c1, c2);
			
			if (b2)
			{
				System.out.println("The strings are ANAGRAM");
			}
			else
			{
				System.out.println("They are not ANAGRAM");
			}
			
			
		}
			
				
	}

}
