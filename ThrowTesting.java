public class ThrowTesting {
	public static void main(String [] args) {
		try {
		System.out.println(Div(5,0));
		}
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Program did not crash.");
		
		
		int[] array = new int[8];
		try
		{
			array[-1] = 2;
		}
		catch(NullPointerException e)
		{
			System.out.println("Missing an array!");
		}
		catch(RuntimeException e)
		{
			System.out.println("An error has occurred!");
		}
	}
	
	public static double Div(double a, double b) {
		if(b==0)
		{
			throw new RuntimeException("I love Programming."); //Could be blank and print "null."
		}
		else 
		{
			return a/b;
		}
	}
}