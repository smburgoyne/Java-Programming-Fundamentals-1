public class MultiplyingFunction {
	public static void main(String [] args) {
		int z = 10;
		double result = multIt(z, 10.0);
		System.out.println("result: " + result + "z: " + z);
	}
	
	public static double multIt(int x, int y) { //int because returning int. Would be void if no return.
		return x*y;
	}
	public static double multIt(int x, double y) {
		double result = x*y;
		x+=10;
		return x*y;
	}
}