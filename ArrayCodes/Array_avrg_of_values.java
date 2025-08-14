package array;

public class Array_avrg_of_values {

	public static void main(String[] args) {
		
		//WAP to find out the average of all the values present in the Array
		
	int [] numbers = new int [4];
	
	numbers [0] = 10;
	numbers [1] = 20;
	numbers [2] = 30;
	numbers [3] = 40;
	
	int sum = 0;
	
	for ( int i = 0; i < 4; i++ )
	{
		 sum += numbers[i];
		 
	/*	 sum= sum+numbers[i];
		 sum = 0 + 10;
		 sum = 10 + 20;
		 sum = 30 + 30;
		 sum = 60 + 40;
		 sum = 100;				*/
	}
	
	System.out.println(sum);
	
	double avrg = sum/numbers.length;
	System.out.println(avrg);

	}

}
