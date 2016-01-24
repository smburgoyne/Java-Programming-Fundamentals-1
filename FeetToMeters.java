import java.util.Scanner;
public class FeetToMeters
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program converts feet to meters.");
		System.out.println("Enter a value for feet: ");
		
		double feet = input.nextDouble();
		double meter = .305*feet;
		
		System.out.print(feet+" feet is "+meter+" meters.");
	}
}
