public class TimeTesting {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		int i = 0;
		while ( i < 1000000000) {
			i++;
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);
		long elapsed = endTime - startTime;;
		System.out.println(elapsed);
		
	}
}