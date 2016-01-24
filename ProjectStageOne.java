import java.util.Scanner;

public class ProjectStageOne {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean exit = false;
		boolean menu2 = true;
		
		while(!exit) {
		
		int choice1;
		int choice2;
		int choice3;
		Passenger newPassenger= null;
		
		System.out.println("Enter option (1, 2, 3): ");
		if(input.hasNextInt())
		{
			choice1 = input.nextInt();
			input.nextLine();
		}
		else
		{
			System.out.println("You have not selected an integer.");
			input.next();
			continue;
		}
		if(choice1 == 1)
		{
			System.out.println("Enter your first name: ");
			String f = input.nextLine();
			
			System.out.println("Enter Your last name: ");
			String l = input.nextLine();
		
			newPassenger = new Passenger(f, l);
			
			System.out.print("newPassenger: ");
			System.out.print(newPassenger.getFirstName());
			System.out.print(newPassenger.getLastName());
		}
		else if(choice1 == 2)
		{
			System.out.println("Enter your first name: ");
			String f = input.nextLine();
			
			System.out.println("Enter Your last name: ");
			String l = input.nextLine();
			
			newPassenger = new Passenger(f, l);
			
			System.out.print("findPassenger: ");
			System.out.print(newPassenger.getFirstName());
			System.out.print(newPassenger.getLastName());
		}
		else if(choice1 == 3)
		{
			exit = true;
			break;
		}
		else
		{
			System.out.println("Not a valid choice. Enter 1, 2, or 3.");
			continue;
		}
		while(menu2) {
		System.out.println("Enter option (1, 2, 3, or 4): ");
		if(input.hasNextInt())
		{
			choice2 = input.nextInt();
			input.nextLine();
		}
		else
		{
			System.out.println("You have not selected an integer.");
			input.next();
			continue;
		}
		if(choice2 == 1)
		{
			System.out.println("Enter <Origination airport> (three letter code): ");
			String o = input.nextLine();
			
			System.out.println("Enter <Destination airport> (three letter code): ");
			String d = input.nextLine();
			
			AvailableFlightPlan findAvailableFlightPlans = new AvailableFlightPlan(o, d);
			findAvailableFlightPlans.printInfo();
		}
		else if(choice2 == 2)
		{
		
		String[] Random = RandomItinerary.get();
		
		while(true)
		{
			int Cancel = Random.length+1;
			
			for(int i = 0; i < Random.length; i++) 
			{
				System.out.println((i+1) + ". " + Random[i]);
			}
			System.out.println(Cancel+ ". " + "cancel");
			
			if(input.hasNextInt())
			{
				choice3 = input.nextInt();
				input.nextLine();
			}
			else
			{
				System.out.println("You have not selected an integer.");
				input.next();
				continue;
			}
			if(choice3 < Cancel && choice3 > 0)
			{
				if(choice3 == 1)
				{
					System.out.print("cancelFlight: " + Random[0] + " ");
					System.out.print(newPassenger.getFirstName());
					System.out.print(newPassenger.getLastName());
					break;
				}
				else if(choice3 == 2)
				{
					System.out.print("cancelFlight: " + Random[1] + " ");
					System.out.print(newPassenger.getFirstName());
					System.out.print(newPassenger.getLastName());
					break;
				}
				else if(choice3 == 3)
				{
					System.out.print("cancelFlight: " + Random[2] + " ");
					System.out.print(newPassenger.getFirstName());
					System.out.print(newPassenger.getLastName());
					break;
				}
				else if(choice3 == 4)
				{
					System.out.print("cancelFlight: " + Random[3] + " ");
					System.out.print(newPassenger.getFirstName());
					System.out.print(newPassenger.getLastName());
					break;
				}
				else
				{
					System.out.print("cancelFlight: " + Random[4] + " ");
					System.out.print(newPassenger.getFirstName());
					System.out.print(newPassenger.getLastName());
					break;
				}
			}
			else if(choice3 == Cancel)
			{
				break;
			}
			else
			{
				System.out.println("Not a valid choice.");
			}
			
		}
		}
		else if(choice2 == 3)
		{
			String[] Random = RandomItinerary.get();
			
			for(int i = 0; i < Random.length; i++) 
			{
				System.out.print("cancelFlight: " + Random[i] + " ");
				System.out.print(newPassenger.getFirstName());
				System.out.print(newPassenger.getLastName());
			}
			
		}
		else if(choice2 == 4)
		{
			break;
		}
		else
		{
			System.out.println("Not a valid choice. Enter 1, 2, 3, or 4.");
		}
		}
		}
	}
}
class AvailableFlightPlan {
	private String Origin;
	private String Destination;
	
	public AvailableFlightPlan(String O, String D) {
		Origin = O;
		Destination = D;
	}
	public void printInfo() {
		String flight = Origin + " " + Destination;
		System.out.println("findAvailableFlightPlans: " +flight);
	}
}