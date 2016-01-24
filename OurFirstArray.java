import java.util.Scanner;

public class OurFirstArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number of ints to reverse: ");
		
		int N = input.nextInt();
		int[] array = new int[N];
		
		System.out.println("Enter " + N + " ints: ");
		
		for(int i=0; i < N; i++)
		{
			array[i] = input.nextInt();
		}
		
		for(int i = N-1; i >= 0; i--)
		{
			System.out.print(array[i] + " ");
		}
	}
}