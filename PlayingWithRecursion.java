public class PlayingWithRecursion {
	public static void main(String[] args) {
		System.out.println(addNum(4));
	}
	
	public static int addNum(int n) {
		if(n==0) 
		{
			return 0;		//also a base case
		}
		else if(n==1) 
		{
			return 1;		//base case
		}
		else if(n>1) 		//recursive case
		{
			return n +addNum(n-1);		//recursive step
		}
		else
		{
			return n;
		}
		//** Base case: Where you don't call the function again.
		//Recursive Step: Goes through the function again.
		//Recursive Case: The condition necessary for the recursive step to occur.
	}
	public static int fib(int n) {
		if(n==1) 
		{
			return 1;
		}
		else if(n==0) 
		{
			return 0;
		}
		else
		{
			return fib(n-1) + fib(n-2);
		}
	}
}