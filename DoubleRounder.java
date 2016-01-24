import java.util.Scanner;
public class DoubleRounder {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean exit = false;
		
		while(true)
		{
			System.out.println("Enter a double to be rounded: ");
			double x;
			
			if(input.hasNextDouble())
			{
				x = input.nextDouble();
			}
			else
			{
				System.out.println("Error. Not a double.");
				input.next();
				continue;
			}
			System.out.println("How many decimals would you like to keep?");
			int decimals;
			if (input.hasNextInt())
			{
				decimals = input.nextInt();
			}
			else
			{
				System.out.println("Error. Not an integer.");
				input.next();
				continue;
			}
			double places = Math.pow(10, decimals);
			if(decimals>=0)
			{
				double result = Math.round(x*places)/places;
				System.out.println(result);
			}
			else
			{
				System.out.println("Error. Decimals cannot be a negative number.");
				input.next();
				continue;
			}
			
		}
	}
}