package array;

public class PrintDuplicateElements {

	public static void main(String[] args) 
	
	{
	// Program to print the duplicate elements of an array.
		int arr [] = {9, 2, 4, 4, 1, 1, 8, 8, 3};
		
		
		for (int i=0; i<=arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if (arr[i]==arr[j])
				{
					System.out.println("Duplicate value: "+arr[j]);
				}
			}
			
		}	
	}

}
