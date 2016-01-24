import java.util.Scanner;
public class GratuityAndTotal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double subtotal;
		double gratPer;		//This is a percentage
		System.out.println("Please enter Subtotal and Gratuity percentage: ");
		subtotal = input.nextDouble();
		gratPer = input.nextDouble();
		double gratDec = gratPer/100.0;
		double gratAmount = subtotal*gratDec;
		double total = subtotal + gratAmount;
		System.out.println("The amount you should tip is: $"+gratAmount);
		System.out.println("The Total amount is: $"+total);
}

}
