import java.util.Scanner;
public class TwoRectanglesLocation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter r1's center x-, y-coordinates, width, and height: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double w1 = input.nextDouble();
		double h1 = input.nextDouble();
		
		System.out.println("Enter r2's center x-, y-coordinates, width, and height: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double w2 = input.nextDouble();
		double h2 = input.nextDouble();
		
		double rs1 = x1+(w1/2);
		double ls1 = x1-(w1/2);
		double ts1 = y1+(h1/2);
		double bs1 = y1-(h1/2);
		
		double rs2 = x2+(w2/2);
		double ls2 = x2-(w2/2);
		double ts2 = y2+(h2/2);
		double bs2 = y2-(h2/2);
		
		if(rs2<=rs1 && ls2>=ls1 && ts2<=ts1 && bs2>=bs1){
			System.out.println("r2 is inside r1");
		}
		else if(rs2<ls1 || ls2>rs1 || ts2<bs1 || bs2>ts1){
			System.out.println("r2 does not overlap r1");
		}
		else{
			System.out.println("r2 overlaps r1");
		}
	}
}