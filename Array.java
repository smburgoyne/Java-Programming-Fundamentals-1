import java.util.Scanner;
public class Array {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int [] array = new int [3];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		
		boolean exit = false;
		while(!exit)
		{
			System.out.println("\nEnter 1 to print out the array \nEnter 2 to change one value of the array \nEnter 3 to replace all of the values in an array with another sequence of three integers \nEnter 4 to get the sum of the array's values\nEnter 0 to quit the program");
		
			int choice;
			if(input.hasNextInt())
			{
			choice = input.nextInt();
			}
			else
			{
			System.out.println("Please enter an integer.");
			input.next();
			continue;
			}
			if(choice == 1){
				for(int i = 0; i < array.length; i++)
				{
					System.out.print(array[i] + " ");
				}
			}
			else if(choice == 2)
			{
			System.out.println("Which index (0-2) would you like to change?");
			int index;
				if(input.hasNextInt())
				{
				index = input.nextInt();
				}
				else
				{
				System.out.println("Please enter an integer.");
				input.next();
				continue;
				}	
				if(index == 0)
				{
				System.out.print("What integer would you like to change the index to?");
				int change;
				if(input.hasNextInt())
				{
				change = input.nextInt();
				}
				else
				{
				System.out.println("Please enter an integer.");
				input.next();
				continue;
				}	
				array [0] = change;
					for(int i = 0; i < array.length; i++)
					{
						System.out.print(array[i] + " ");
					}
				}
				else if(index == 1)
				{
				System.out.print("What integer would you like to change the index to?");
				int change;
				if(input.hasNextInt())
				{
				change = input.nextInt();
				}
				else
				{
				System.out.println("Please enter an integer.");
				input.next();
				continue;
				}	
				array [1] = change;
					for(int i = 0; i < array.length; i++)
					{
						System.out.print(array[i] + " ");
					}
				}
				else if(index == 2)
				{
				System.out.print("What integer would you like to change the index to?");
				int change;
				if(input.hasNextInt())
				{
				change = input.nextInt();
				}
				else
				{
				System.out.println("Please enter an integer.");
				input.next();
				continue;
				}	
				array [2] = change;
					for(int i = 0; i < array.length; i++)
					{
						System.out.print(array[i] + " ");
					}
				}
				else
				{
				System.out.println("Not a valid index. Choose an index (0-2).");
				}
			}
			else if(choice == 3)
			{
				System.out.println("Enter three integers you would like in your new array: ");
				if(input.hasNextInt())
				{
					for(int i=0; i < 3; i++)
					{
					array[i] = input.nextInt();
					}
					for(int i = 0; i < array.length; i++)
					{
					System.out.print(array[i] + " ");
					}
				}
				else
				{
					System.out.println("Please enter only integers.");
					input.next();
					continue;
				}
			}
			else if(choice == 4)
			{
				int sum = array[0] + array[1] + array[2];
				System.out.println("The sum of the array is: "+sum);
			}
			else if(choice == 0)
			{
				System.out.print("Thank you! Your final array is: ");
				for(int i = 0; i < array.length; i++)
				{
				System.out.print(array[i] + " ");
				exit = true;
				}
			}
			else
			{
				System.out.print("That is not a valid choice. Please enter an integer 0-4.");
				continue;
			}
	}
}
}