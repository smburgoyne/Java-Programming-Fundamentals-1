import java.util.Scanner;
public class StringPermutation {
	public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a string to permutate: ");
	String s = input.nextLine();
	displayPermutation(s);
		
		System.out.println("Enter a credit card number as a long integer: ");
		long number = input.nextLong();
		if(isValid(number))
		{
			System.out.println(number + " is valid");
		}
		else 
		{
			System.out.println(number + " is invalid");
		}
	}
public static void displayPermutation(String s) { 
	    displayPermutation("", s); 
	}

	private static void displayPermutation(String s1, String s2) {
		int length = s2.length();
	    if (length == 0) 
	    	{
	    		System.out.println(s1);
	    	}
	    else {
	        for (int i = 0; i < length; i++)
	        {
	            displayPermutation((s1 + s2.charAt(i)), (s2.substring(0, i) + s2.substring(i+1, length)));
	        }
	    }
	}
}