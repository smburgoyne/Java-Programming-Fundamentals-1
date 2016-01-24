import java.util.Scanner;

public class DivisionQuiz {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		//Randomly generated question
		//-needs two numbers
		
		System.out.println("Welcome to the Division Quiz Program!");
		System.out.println("How many questions would you like on your quiz?");
		
		int numofQuestions = input.nextInt();
		
		while (numofQuestions > 0)
		{
		
		int x,y;  //We're going to divide integers.
		//Don't allow y == 0!
		
		int MIN = 1;
		int MAX = 10;
		
		int questionsAsked = 0;
		
		int numCorrect = 0;
		
		while(questionsAsked < numofQuestions)
		{
		
		x = (int) (Math.random() * (MAX - MIN) + MIN);
		y = (int) (Math.random() * (MAX - MIN) + MIN);
		
		System.out.println("What is the result of " + x + "/" + y + "?" );
		
		//We're going to convert these to double, as a fraction, and ask that as a question.
		
		double userAnswer = input.nextDouble();
		
		double trueAnswer = ((double) x) / y;
		
		//We now want to check for floating-point "equality." Error range: .001?
		
		double ERROR_RANGE = 0.001;
		
		if(Math.abs(userAnswer - trueAnswer) < ERROR_RANGE)
		{
			System.out.println("Answer is correct!");
			numCorrect += 1;
		}
		else
		{
			System.out.println("Answer is incorrect - should be " + trueAnswer + "!");
		}
		
		questionsAsked += 1;
		
		System.out.println("We have asked "+questionsAsked+ " questions.");
		}
		System.out.println("You got "+numCorrect+" questions right!");
		int numWrong = numofQuestions - numCorrect;
		System.out.println("You got "+numWrong+" wrong.");
		
		System.out.println("How many questions would you like on your next quiz?");
		numofQuestions = input.nextInt();
		}
	}
}