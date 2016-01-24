import junit.framework.Assert;

import org.junit.Test;


public class CreditCardVerifierVerifier 
{

	@Test(timeout = 200)
	public void debug_getPrefixTest() 
	{
		Assert.assertEquals(43, HW3.getPrefix(4388576018410707L, 2));
		Assert.assertEquals(34, HW3.getPrefix(344381667384076L, 2));
	}
	
	@Test(timeout = 200)
	public void debug_getSizeTests() 
	{
		Assert.assertEquals(16, HW3.getSize(4388576018410707L));
		Assert.assertEquals(15, HW3.getSize(344381667384076L));
		
		Assert.assertEquals(2, HW3.getSize(43));
	}
	
	@Test(timeout = 200)
	public void debug_prefixMatchTest()
	{
		Assert.assertEquals(true, HW3.prefixMatched(4388576018410707L, 43));
	}
	
	@Test(timeout = 200)
	public void debug_evenSumTest()
	{
		Assert.assertEquals(37, HW3.sumOfDoubleEvenPlace(4388576018402626L));
		Assert.assertEquals(38, HW3.sumOfDoubleEvenPlace(344381667384076L));
	}
	
	@Test(timeout = 200)
	public void debug_oddSumTest()
	{
		Assert.assertEquals(38, HW3.sumOfOddPlace(4388576018402626L));
		Assert.assertEquals(42, HW3.sumOfOddPlace(344381667384076L));
	}
	
	@Test(timeout = 200)
	public void bookExamplesTest()
	{
		Assert.assertEquals(true, HW3.isValid(4388576018410707L));
		Assert.assertEquals(false, HW3.isValid(4388576018402626L));
	}
	
	@Test(timeout = 200)
	public void standardEvenDigits()
	{
		Assert.assertEquals(true,  HW3.isValid(6011326990276126L));		
		Assert.assertEquals(false, HW3.isValid(6011326990276123L));  // Fails the Luhn check.
		Assert.assertEquals(true,  HW3.isValid(5436863455832646L));	
	}
	
	@Test(timeout = 200)
	public void standardOddDigits()
	{
		Assert.assertEquals(true,  HW3.isValid(371121541135179L));
		Assert.assertEquals(true,  HW3.isValid(4131402767965L));		
	}
	
	@Test(timeout = 200)
	public void badPrefix_OddDigits()
	{
		Assert.assertEquals(false, HW3.isValid(1305791468566L)); // Bad prefix, good number.  Is a short one.
		Assert.assertEquals(false, HW3.isValid(344381667384076L)); // 34 isn't supposed to be a valid prefix, according to the HW.
	}

	@Test(timeout = 200)
	public void badPrefix_EvenDigits()
	{
		Assert.assertEquals(false, HW3.isValid(9160266726415254L)); // Bad prefix, good number.  Is a long one.	
	}
	
	@Test(timeout = 200)
	public void badLengthTests()
	{
		Assert.assertEquals(false, HW3.isValid(48706286977L));  // Too short, but meets the other checks.
		Assert.assertEquals(false, HW3.isValid(601132699027612659L));  // Too long, meets other checks.
	}
	
//	// Used to test numbers that meet the constraints, but fail in other aspects.
//	@Test(timeout = 200)
//	public void luhnCheckTester()
//	{
//		long number = 9160266726415254L;
//		
//		int sum = HW3.sumOfDoubleEvenPlace(number) + HW3.sumOfOddPlace(number);
//		
//		if(sum % 10 != 0) fail("Obtained Luhn check sum for " + number + " is " + sum + " - not divisible by 10!");
//	}
}
