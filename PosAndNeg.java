import java.util.Scanner;
public class PosAndNeg {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int countPos = 0;
		int countNeg = 0;
		int total = 0;
		int sum = 0;
		int number = input.nextInt();
		
		System.out.println("Enter an integer, the input ends if it is 0: ");
		
		while(number != 0)
		{
			
			if(number < 0)
			{
				countNeg++;
			}
			else
			{
				countPos++;
			}
			total++;
			sum = sum + number;
			
			System.out.println("Enter an integer, the input ends if it is 0: ");
			number = input.nextInt();
		}
		
		System.out.println("The number of positives is "+countPos+"\nThe number of negative is "+countNeg+"\nThe total is "+total+"\nThe average is "+sum/total);
	}
}
