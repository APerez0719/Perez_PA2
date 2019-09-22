import java.util.Scanner;

public class perez_p2
	{

	public static void main(String[] args)
	{
		//Just a question for the TA, I initially hadn't initialized the BMI variable on line 11, but for some reason
		//when I had the if statements farther down, it was giving me an issue, informing me it hadn't been initialized
		//why would I need to initialize the variable if, regardless, it will be calculated when a new user inputs their information?
		float lbs, heightin, kg, heightm, BMI=0;
		int count;
		
		System.out.println("Metric or Imperial? \n 1. Imperial	2. Metric");
		Scanner scnr = new Scanner(System.in);
		count = scnr.nextInt();
		
		while(count != 1 || count != 2)
		{
			System.out.println("Metric or Imperial? \n 1. Imperial	2. Metric");
			count = scnr.nextInt();
			if(count == 1 || count == 2)
				break;
		}
		if(count == 1)
		{
			System.out.println("Enter weight in pounds: ");
			lbs = scnr.nextFloat();
			
			System.out.println("Enter height in inches: ");
			heightin = scnr.nextFloat();
			
			BMI = 703*lbs / (heightin*heightin);
		}
		
		else if(count == 2)
		{
			System.out.println("Enter weight in kilograms: ");
			kg = scnr.nextFloat();
			
			System.out.println("Enter height in meters: ");
			heightm = scnr.nextFloat();
			
			scnr.close();			
			BMI = kg / (heightm*heightm);
		}
		
		//Display BMI value for user
		System.out.println("Your BMI is: " + BMI);
		
		if(BMI < 18.5)
		{
			System.out.println("A BMI less than 18.5 indicates that you are underweight.");
		}
		else if(BMI <= 24.9)
		{
			System.out.println("A BMI between 18.5 and 24.9 is a healthy BMI");
		}
		else if(BMI <= 29.9)
		{
			System.out.println("A BMI between 25 and 29.9 indicates that you are overweight");
		}
		else
		{
			//Last case does not need an if statement
			System.out.println("A BMI greater than 30 indicates that you are obese.");
		}
		return;
	}
}
