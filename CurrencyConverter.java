import java.util.Scanner;
public class CurrencyConverter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program converts US dollars to Euros, Pounds, and Rupees. Please enter US dollars below.");
		System.out.println("US dollars: ");
		double usd = input.nextDouble();
		double euro, pound, rupee;
		euro = usd*.85339;
		pound = usd*.65719;
		rupee = usd*61.7930;
		
		System.out.println("Euros: "+euro);
		System.out.println("Pounds: "+pound);
		System.out.println("Rupees: "+rupee);
	}
}