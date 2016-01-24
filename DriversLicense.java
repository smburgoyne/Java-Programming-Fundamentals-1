import java.util.Scanner;
public class DriversLicense {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first name: ");
		String fName = input.nextLine();
		
		System.out.println("Enter middle initial: ");
		String mName = input.nextLine();
		
		System.out.println("Enter last name: ");
		String lName = input.nextLine();
		
		System.out.println("Male or Female (Type M or F): ");
		String gender1 = input.nextLine();
		boolean gender;
		if(gender1 == "F") {
			gender = true;
		}
		else gender = false;
		
		System.out.println("Enter birth date (Form of mm dd yy; no slashes!): ");
		int month = input.nextInt();
		int day = input.nextInt();
		int year = input.nextInt();
		
		
		
	}
	public int fNumber(String fName) {
		
	}
	public int mNumber(String mName) {
		
	}
}