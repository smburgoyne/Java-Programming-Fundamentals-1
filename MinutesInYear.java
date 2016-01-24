import java.util.Scanner;
public class MinutesInYear
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program converts minutes into years and days");
		System.out.println("Enter the number of minutes: ");
		
		int minutes = input.nextInt();
		
		int days = minutes/1440;
		
		int years = days/365;
		days = days%365;
		
		System.out.println(minutes+" minutes is approximately "+years+" years and "+days+" days.");
		
	}
}