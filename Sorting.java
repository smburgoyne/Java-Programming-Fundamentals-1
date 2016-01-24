import java.util.Arrays;
public class Sorting {
	public static void main(String[] args) {
		
		System.out.println("This program will sort a randomly generated array of ints.");
		
		int N = 10;
		int[] numbers = new int[N];
		
		for(int i = 0; i < N; i++)
		{
			numbers[i] = (int)(Math.random() * 100 - 50);
		}
		
		System.out.println();
		System.out.println("Initial array: ");
		System.out.println(Arrays.toString(numbers));
		
		for(int end = numbers.length - 1; end >= 1; end--)
		{
			for(int i=0; i < end; i++)
			{
				if(numbers[i] > numbers[i+1])
				{
					int temp = numbers[i];
					numbers[i] = numbers[i+1];
					numbers[i+1] = temp;
				}
			}
		}
		System.out.println();
		System.out.print("Final array: ");
		System.out.print(Arrays.toString(numbers));
	}
}
