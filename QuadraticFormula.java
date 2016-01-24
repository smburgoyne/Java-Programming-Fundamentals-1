import java.util.Scanner;
public class QuadraticFormula
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program computes the roots of a given quadratic equation.");
		System.out.println("Enter a, b, c: ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double bsq = Math.pow(b,2.0);
		double discriminate = bsq-(4.0*a*c);
		double sqroot = Math.pow(discriminate, 0.5);
		
		double r1 = (-b+sqroot)/(2.0*a);
		double r2 = (-b-sqroot)/(2.0*a);
		
		
		if(discriminate>0)
		{
			System.out.println("The equation has two roots "+r1+" and "+r2);
		}
		else if(discriminate==0)
		{
			System.out.println("The equation has one root "+r1);
		}
		else System.out.println("The equation has no real roots.");
	}
}