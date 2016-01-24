import java.util.Scanner;

public class InputValidator {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int x = 0;
		
		boolean err;
		
		do
		{
			err = false;
			
			System.out.println("Enter an in, 1-10: ");
			if(input.hasNextInt())
			{
				x = input.nextInt();
				
				if(x<1 || x>10)
				{
					System.out.println("Error - input is not in range!");
					err = true;
				}
			}
			else
			{
				System.out.println("Error = input is not an integer!");
				err = true;
				input.nextInt();
			}
		}
		while(err);
			if(!err)
			{
				System.out.println("Input is good: x = " + x);
			}
	}
}