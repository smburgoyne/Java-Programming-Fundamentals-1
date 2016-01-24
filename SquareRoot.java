import java.util.Scanner;
public class SquareRoot {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double N;
		while(true)
		{
			System.out.println("Enter a number between 0 and 1000.");
			if(input.hasNextDouble())
			{
				N = input.nextDouble();
			}
			else
			{
				System.out.println("Bad input!");
				input.next();
				continue;
			}
			if(N >= 0 && N < 1000)
			{
				double x = Math.sqrt(N);
				System.out.println("Square root is: " + x);
				break;
			}
			else 
			{
				System.out.println("Bad input! Not in range.");
				input.next();
				continue;
			}
		}
	}
}