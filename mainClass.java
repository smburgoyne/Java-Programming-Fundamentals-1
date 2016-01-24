import java.util.Arrays;

class mainClass {
	public static void main(String[] args) {
		stopWatch stopWatch1 = new stopWatch();
		
		int[] numbers = {7, 3, 0, 1, 5, 2, 2, 6, 1, 5, 0, 2, 6, 8, 4, 0, 2, 6, 3, 8, 4, 5, 0, 1, 5, 2 ,6, 6,2,1,8,7,9,4,3,1,3,1,2,3,1,3,9,3,7,6,2,4,6,1,3,5,4,2,5,8,6};
		
		stopWatch1.StartTime();
		for(int end = numbers.length - 1; end >= 1; end--)
		{
			// At the end of each iteration of this outer loop, "end" will contain the correct #.
			
			for(int i=0; i < end; i++)
			{
				// Swap the pair represented, if appropriate.
				
				if(numbers[i] > numbers[i+1])
				{
					int temp = numbers[i];
					numbers[i] = numbers[i+1];
					numbers[i+1] = temp;
				}
			}
		}
		stopWatch1.EndTime();
		System.out.println(Arrays.toString(numbers));
		System.out.println(stopWatch1.getElapsedTime());
		
		stopWatch stopWatch2 = new stopWatch();
		
		 
		stopWatch2.StartTime();
		Arrays.sort(numbers);
		stopWatch2.EndTime();
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(stopWatch2.getElapsedTime());
	}
}
	class stopWatch {
		private long startTime;
		private long endTime;
		private long elapsedTime;
		
		public stopWatch() {
			startTime = System.currentTimeMillis();
		}
		public void StartTime() {
			 startTime = System.currentTimeMillis();
		}
		public void EndTime() {
			endTime = System.currentTimeMillis();
		}
		public long getElapsedTime() {
			elapsedTime = endTime - startTime;
			return elapsedTime;
		}
	}
