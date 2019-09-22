import java.util.Scanner;

public class perez_p3
{
	public static void main (String[] args)
	{
		String[] Topics = {"Video Games", "Sleep", "Food", "Friends", "Money"};
		String[] HighestScoringTopic;
		String[] LowestScoringTopic;
		int[][] Scores = new int [Topics.length][];
		int i, j, score, numUsers, PointTallyHigh = 0, PointTallyLow = 0;
		Scanner scnr = new Scanner(System.in);
		
		//Initialize the ratings array with 0's
		for(i = 0; i < Scores.length ; i++)
		{
			Scores[i] = new int[10];
			for(j = 0; j < Scores[i].length; j++)
			{
				Scores[i][j] = 0;
			}
		}
		
		System.out.print("How many users will be taking the survey?: ");
		numUsers = scnr.nextInt();
		
		//Stacked for loop to allow each user to use 
		
		for(i = 0; i < numUsers; i++)
		{
			System.out.println("From 1-10, how important are these subjects to you?");
			for(j = 0; j < Topics.length; j++)
			{
				System.out.println("How important is " + Topics[j] + " to you?: ");
				score = scnr.nextInt();
				while(score < 1 || score > 10)
				{
					System.out.println("Invalid input, rating should be between 1 and 10 \n Try again: ");
					score = scnr.nextInt();
				}
				
				Scores[j][score-1]++; //Tally up how many votes were a certain number
			}
		}
		
		//After filling in all of the surveys, program will now find largest and lowest point values.
	}
}
