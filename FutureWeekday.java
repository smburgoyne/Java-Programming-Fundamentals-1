import java.util.Scanner;
public class FutureWeekday
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter today's day: ");
		
		int today = input.nextInt();
		

		System.out.println("Enter the number of days elapsed since today: ");
		
		int infd = input.nextInt();
		
		int fd = (today+infd)-(((today+infd)/7)*7);
		
		
		if(today==0){
			System.out.print("Today is Sunday and ");
		}
		else if(today==1){
			System.out.print("Today is Monday and ");
		}
		else if(today==2){
			System.out.print("Today is Tuesday and ");
		}
		else if(today==3){
			System.out.print("Today is Wednesday and ");
		}
		else if(today==4){
			System.out.print("Today is Thursday and ");
		}
		else if(today==5){
			System.out.print("Today is Friday and ");
		}
		else {
			System.out.print("Today is Saturday and ");
		}
		
		if(fd==0){
			System.out.print("future day is Sunday.");
		}
		else if(fd==1){
			System.out.print("future day is Monday.");
		}
		else if(fd==2){
			System.out.print("future day is Tuesday.");
		}
		else if(fd==3){
			System.out.print("future day is Wednesday.");
		}
		else if(fd==4){
			System.out.print("future day is Thursday.");
		}
		else if(fd==5){
			System.out.print("future day is Friday.");
		}
		else {
			System.out.print("future day is Saturday.");
		}
	}
}