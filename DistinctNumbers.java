import java.util.Scanner;

public class DistinctNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter ten numbers: ");
		
		int[] array = new int[10];
		
		for(int i = 0; i < 10; i++)
		{
			array[i] = input.nextInt();
		}
		
		int distinctCount = 0;
		int[] distinctArray = new int[10];
		
		for(int i = 0; i < 10; i++)
		{
			boolean distinct = true;
			
			for(int j = 0; j < i; j++)
			{
				if(array[i] == array[j])
				{
					distinct = false;
				}
			}
			if(distinct)
			{
				distinctArray[distinctCount++] = array[i];
				distinctArray[distinctCount] = array[i];
				distinctCount++;
			}
		}
		System.out.println("The number of distinct numbers are " + distinctCount);
		System.out.print("The distinct numbers are: ");
		
		for(int i=0; i < distinctCount; i++)
		{
			System.out.println(distinctArray[i] + " ");
		}
	}
}
		