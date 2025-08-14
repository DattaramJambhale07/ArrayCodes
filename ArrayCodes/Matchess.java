package array;

public class Matchess {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String s1 = "Program";
		
		//Check if the given string consist exact 7 letters in it without using length method
		boolean b1 = s1.matches("(.......)");				//each dot contain each index position
		System.out.println(b1);
		
		//Check if the string start with P
		boolean b2 = s1.matches("P(.*)");
		System.out.println(b1); 				//(.*) this act same as Like% of SQL
		
		//Check if the string start with m
		boolean b3 = s1.matches("(.*)m");
		System.out.println(b3);

		//Check if the string contains "gram" in it.
		boolean b4 = s1.matches("(.*)gram(.*)");
		System.out.println(b4);
		
	
	}

}
