import java.util.Scanner;
public class TrianglePrinter
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How large should you triangle's edge be?");
		int len = input.nextInt();
		for(int i=1; i < len; i++)
		{
			System.out.println("X");
			for(int j=1; j <= i; j++)
			{
			System.out.print("X");
			}
		}
		System.out.print("X");
		System.out.println();
	}
}