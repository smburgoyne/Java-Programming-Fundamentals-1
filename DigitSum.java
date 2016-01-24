import java.util.Scanner;
public class DigitSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		System.out.println(addDigit(x));
	}
	public static int addDigit(int n) {
		
		if(n < 10)
		{
			return n;
		}
		else
		{	
			int d;
			d = n%10;
			return d + addDigit(n/10);
		}
	}
}