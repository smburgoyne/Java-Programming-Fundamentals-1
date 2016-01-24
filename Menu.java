import java.util.Scanner;
public class Menu {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double bill = 0;
		boolean exit = false;
		
		while(!exit)
			{
			System.out.println("Would you like to stay and eat(1) or would you like the check(0)?");
			int choice;
			if(input.hasNextInt())
			{
				choice = input.nextInt();
			}
			else
			{
				System.out.println("You have not selected an integer.");
				input.next();
				continue;
			}
			if(choice == 1)
			{
				System.out.println("Steak(0) $15.99\nChicken(1) $20.00");
				int order;
				if(input.hasNextInt())
					{
					order = input.nextInt();
					}
					
				else
					{
					System.out.println("Not a valid entree.");
					input.next();
					continue;
					}
				if(order == 0)
					{
					System.out.println("You have ordered a Steak, $15.99 will be added to your bill.");
					bill += 15.99;
					}
				else if(order == 1)
					{
					System.out.println("You have ordered chicken, $20.00 will be added to your bill.");
					bill += 20.00;
					}
				else
					{
					System.out.println("Your input was neither 0 nor 1. Please enter an appropriate value.");
					}
			}
			else if(choice == 0)
			{
					System.out.println("Your bill is: " + bill);
					exit = true;
			}
			else
			{
				System.out.println("That is not a valid choice. Please enter either 0 or 1.");
				continue;
			}
		}
	}
}