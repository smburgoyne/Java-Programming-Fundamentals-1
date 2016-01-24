public class Question {
	public static void main(String[] args) {
		Question1 q = new Question1(2, 7);
		System.out.println(q.num);
	}
}
class Question1 {
	public int num;
	public int denom;
	
	public Question1(int n, int d)
	{
		num = n;
		denom = d;
	}
	public double getValue()
	{
		return ((double) num) / denom;
	}
	public String toString()
	{
		return num + "/" + denom;
	}
}