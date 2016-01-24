	import java.util.Scanner;
public class FahrenheitToCelsius {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double f;
	double c;
	
	System.out.println("Degress F is: ");
	
	f = input.nextDouble();
	c = 5.0/9*(f-32.0);
	int x = (int) c;
	System.out.println("Degrees Celsius: "+x);
	
	}

}
