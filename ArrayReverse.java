import java.util.Scanner;
public class ArrayReverse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number of ints to reverse: ");
		
		int N = input.nextInt();
		
		int[] array = new int[N];
		
		System.out.print("Enter " + N + "int: ");
		
		for(int i=0; i < N; i++)
		{
			array[i] = input.nextInt();
		}
		
		System.out.print("Your inputs, reversed: ");
		
		for(int i = N-1; i>= 0; i--)
		{
			System.out.print(array[i] + " ");
		}
	}
}