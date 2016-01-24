import java.util.Scanner;
public class AgeCategorizer {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program categorizes people by age.");
		System.out.println("Enter a person's age: ");
		
		//We chose to work with integers.
		int age = input.nextInt();
		
		//We chose to start with oldest first.
		if(age >= 65)
		{
			//65+ (retired) (elder)
			System.out.println("retired.");
		}
		else if(age >= 20)
		{
			//adults
			System.out.println("an adult.");
		}
		else if(age >= 13)
		{
			//teens
			System.out.println("a teen.");
		}
		else if(age > 5)
		{
			//kids
			System.out.println("a kid.");
		}
		else if(age >2)
		{ 
			//toddlers
			System.out.println("a toddler.");
		}
		else
		{
			//babies
			System.out.println("a baby.");
		}
	}
}