public class Trial {
	public static void main(String [] args) {
		long l = 1623452186325412L;
		System.out.println(sumOfDoubleEvenPlace(l));
	}
	public static double tenplace = 15;
	public static int sumOfDoubleEvenPlace(long number) {
		double tplace = Math.pow(10, tenplace);
		long place = (long)tplace;
		long digit = number/place;
		number = number%(place/10);
		tenplace--;
		int intdigit = (int)(digit*2);
		return intdigit + sumOfDoubleEvenPlace(number);
	}
}
	