import java.util.Scanner;
public class HW3 {
	public static boolean isValid(long number) {
		long sumVerifier = (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number));
		boolean prefixVerifier = false;
		if(prefixMatched(number, 37) || prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 6)) 
		{
			prefixVerifier = true;
		}
		else
		{
			prefixVerifier = false;
		}
		if(sumVerifier%10 == 0 && getSize(number) != 0 && prefixVerifier)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static int sumOfDoubleEvenPlace(long number) {
		long digit1 = number/1000000000000000L;
		number = number%100000000000000L;
		digit1 = digit1*2;
		if(digit1 > 9)
		{
			digit1 = getDigit((int)digit1);
		}
		long digit2 = number/10000000000000L;
		number = number%1000000000000L;
		digit2 = digit2*2;
		if(digit2 > 9)
		{
			digit2 = getDigit((int)digit2);
		}
		long digit3 = number/100000000000L;
		number = number%10000000000L;
		digit3 = digit3*2;
		if(digit3 > 9)
		{
			digit3 = getDigit((int)digit3);
		}
		long digit4 = number/1000000000L;
		number = number%100000000L;
		digit4 = digit4*2;
		if(digit4 > 9)
		{
			digit4 = getDigit((int)digit4);
		}
		long digit5 = number/10000000L;
		number = number%1000000L;
		digit5 = digit5*2;
		if(digit5 > 9)
		{
			digit5 = getDigit((int)digit5);
		}
		long digit6 = number/100000L;
		number = number%10000L;
		digit6 = digit6*2;
		if(digit6 > 9)
		{
			digit6 = getDigit((int)digit6);
		}
		long digit7 = number/1000L;
		number = number%100L;
		digit7 = digit7*2;
		if(digit7 > 9)
		{
			digit7 = getDigit((int)digit7);
		}
		long digit8 = number/10L;
		number = number%1L;
		digit8 = digit8*2;
		if(digit8 > 9)
		{
			digit8 = getDigit((int)digit8);
		}
		long sum = digit1+digit2+digit3+digit4+digit5+digit6+digit7+digit8;
		return((int)sum);
	}
	public static int getDigit(int number) {
		int onesplace = number%10;
		int tensplace = number/10;
		return onesplace + tensplace;
	}
	public static int sumOfOddPlace(long number) {
		number = number%1000000000000000L;
		long digit1 = number/100000000000000L;
	
		number = number%10000000000000L;
		long digit2 = number/1000000000000L;
		
		number = number%100000000000L;
		long digit3 = number/10000000000L;
		
		number = number%1000000000L;
		long digit4 = number/100000000L;
		
		number = number%10000000L;
		long digit5 = number/1000000L;
	
		number = number%100000L;
		long digit6 = number/10000L;
	
		number = number%1000L;
		long digit7 = number/100L;
		
		number = number%10L;
		long digit8 = number;
		
		long sum = digit1+digit2+digit3+digit4+digit5+digit6+digit7+digit8;
		return((int)sum);
	}
	public static boolean prefixMatched(long number, int d) {
		if((int)getPrefix(number, 2) == d)
		{
			return true;
		}
		else if((int)getPrefix(number, 1) == d)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static int getSize(long d) {
		if(d/10000000000000000L != 0)
		{
			return 0;
		}
		else if(d/1000000000000000L != 0)
		{
			return 16;
		}
		else if(d/100000000000000L != 0)
		{
			return 15;
		}
		else if(d/10000000000000L != 0)
		{
			return 14;
		}
		else if(d/1000000000000L != 0)
		{
			return 13;
		}
		else
		{
			return 0;
		}
	}
	public static long getPrefix(long number, int k) {
		if(getSize(number) < k)
		{
			return number;
		}
		else
		{
			double tensplace = Math.pow(10, (getSize(number) - k));
			long ltensplace = (long)tensplace;
			return number/ltensplace;
		}
	}
	public static void displayPermutation(String s) { 
	    displayPermutation("", s); 
	}

	public static void displayPermutation(String s1, String s2) {
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