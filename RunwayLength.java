import java.util.Scanner;
public class RunwayLength
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program calculates the minimum runway length necessary for an airplane of a given speed and acceleration.");
		System.out.println("Enter speed and acceleration: ");
		
		double vinput = input.nextDouble();
		double a = input.nextDouble();
		
		double v = Math.pow(vinput,2);
		
		double l = v/(2*a);
		
		System.out.println("The minimum runway length for this airplane is: "+l);
	}
}