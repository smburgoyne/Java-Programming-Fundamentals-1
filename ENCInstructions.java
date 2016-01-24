import java.util.Scanner;
import java.util.ArrayList;

public class ENCInstructions {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean exit = false;
		boolean menu2 = true;
		Vehicle car = new Vehicle(4, 2, 2, "red pinstripe", true);
		Vehicle trike = new Vehicle(3, 0, 1, "purple", false);
		
		while(!exit) {
			int choice1;
			int choice2;
			Person newPerson = null;
			System.out.println("Enter option (1, 2): ");
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
				
				System.out.println("Enter your last name: ");
				String l = input.nextLine();
				
				System.out.println("Enter your age: ");
				int a = input.nextInt();
				
				System.out.println("Enter your height(meters): ");
				int h = input.nextInt();
				
				System.out.println("Enter your weight(lbs): ");
				int w = input.nextInt();
				
				System.out.println("Enter your marital status(m for married, s for single): ");
				String m1 = input.next();
				boolean m;
				if(m1.equals("m")) 
				{
					m = true;
				}
				else
				{
					m = false;
				}
				
			
				newPerson = new Person(f, l, a, h, w, m);
				
				System.out.print("newPerson: ");
				newPerson.printInfo();
			}
			else if(choice1 == 2)
			{
				exit = true;
				break;
			}
			else
			{
				System.out.println("Not a valid choice. Enter 1 or 2.");
				continue;
			}
			
			while(menu2) {
				System.out.println("Enter option (1, 2, 3, 4, or 5): ");
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
					System.out.println("Enter new height: ");
					int h = input.nextInt();
					newPerson.setHeight(h);
					newPerson.printInfo();
				}
				else if(choice2 == 2)
				{
					System.out.println("Enter new weight: ");
					int w = input.nextInt();
					newPerson.setWeight(w);
					newPerson.printInfo();
				}
				else if(choice2 == 3)
				{
					System.out.println("Enter new marital status: ");
					String m1 = input.nextLine();
					boolean m2;
					if(m1.equals("m")) 
					{
						m2 = true;
					}
					else
					{
						m2 = false;
					}
					newPerson.setMarritalStatus(m2);
					newPerson.printInfo();
				}
				else if(choice2 == 4)
				{
					System.out.println("Enter vehicle type(Options car or trike): ");
					String vehicle = input.nextLine();
					if(vehicle.equals("car")) 
					{
						newPerson.addVehicle(car);
					}
					else if(vehicle.equals("trike"))
					{
						newPerson.addVehicle(trike);
					}
				}
				else if(choice2 == 5)
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

class Person {
	private String firstName;
	private String lastName;
	private int age;
	private int height;
	private int weight;
	private boolean maritalStatus;
	private ArrayList<Vehicle> vehicles;
	
	public Person(String firstName, String lastName, int a, int h, int w, boolean m) {
		
		if(firstName == null || lastName == null) throw new RuntimeException();
		
		this.firstName = firstName;
		this.lastName = lastName;
		age = a;
		height = h;
		weight = w;
		maritalStatus = m;
		vehicles = new ArrayList<Vehicle>();
	}
	public void printInfo() {
		System.out.println(firstName + " " + lastName + " " + age + " " + height + " " + weight + " " + maritalStatus + "\n");
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public int getHeight() {
		return height;
	}
	public int getWeight() {
		return weight;
	}
	public boolean getMarritalStatus() {
		return maritalStatus;
	}
	public ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}
	
	public void setFirstName(String f) {
		firstName = f;
	}
	public void setLastName(String l) {
		lastName = l;
	}
	public void setAge(int a) {
		age = a;
	}
	public void setHeight(int h) {
		height = h;
	}
	public void setWeight(int w) {
		weight = w;
	}
	public void setMarritalStatus(boolean m) {
		maritalStatus = m;
	}
	public void addVehicle(Vehicle v) {
		vehicles.add(v);
	}
}