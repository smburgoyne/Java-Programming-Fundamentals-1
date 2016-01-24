import java.util.Scanner;
public class ImperialConverter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program converts inches to miles, yards, feet, and inches. Please enter number of inches below.");
		System.out.println("Number of inches: ");
	
				int inches = input.nextInt();
				int feet;
				
				feet = inches/12;
				inches = inches%12;
				
				int yards;
				yards = feet/3;
				feet = feet%3;
				
				int miles;
				miles = yards/1760;
				yards = yards%1760;
				
				System.out.println("Miles: "+miles);
				System.out.println("Yards: "+yards);
				System.out.println("Feet: "+feet);
				System.out.println("Inches: "+inches);
				
	}
	
}