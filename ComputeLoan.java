import java.util.Scanner;

public class ComputeLoan
{
	public static void main(String[] args)
	{
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Enter annual interest rate in percentage, e.g., 3.25%
		System.out.print("Enter annual interest rate, e.g., 3.25%: ");
		double annualInterestRate = input.nextDouble();

		// Obtain monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;

		//Enter number of years
		System.out.print("Enter number of years as an integer, e.g. 1: ");
		int numberOfYears = input.nextInt();

		//Enter investment amount
		System.out.print("Enter loan amount, e.g., 1000: ");
		double investmentAmount = input.nextDouble();

		//Calculate payment
		double monthlyPayment = investmentAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;

		//Display Results
		System.out.println("The monthly payment is $" + (int)(totalPayment * 100) / 100.0);
	}
}