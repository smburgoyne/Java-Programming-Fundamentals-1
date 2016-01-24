public class Testing {
	public static void main (String [] args) {
		String a = "apple";
		a.charAt(0);
		
		//a(0), p(1), p(2), l(3), e(4)
		String b = a.substring(1);
		String c = a.substring(1, 3);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}