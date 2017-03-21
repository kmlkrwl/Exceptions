import java.util.Scanner;
import java.util.InputMismatchException;

public class DivideByZeroExceptionHandling 
{
	public static int quotient(int numerator, int denominator)
	{
		return numerator/denominator;
		
	}

	public static void main(String[] args)
	{
	Scanner scanner = new Scanner(System.in);
	boolean continueLoop = true;
	do
	{
		try
		{
		System.out.printf("Please enter an integer numerator: ");
		int numerator = scanner.nextInt();
		System.out.printf("Please enter an integer denominator: ");
		int denominator = scanner.nextInt();

		int result = quotient(numerator, denominator);
		System.out.printf("\nResult: %d/%d = %d\n", numerator, denominator, result);
		continueLoop = false;
		} //end try
	catch(InputMismatchException inpex)
		{
		System.err.printf("\nException type: %s\n", inpex);
		scanner.nextLine(); //discard user input
		System.out.println("You must enter integers. Please try again\n");
		}
	catch(ArithmeticException aex)
		{
		System.err.printf("\nException type: %s\n", aex);
		System.out.println("Zero is an invalid denominator. Please try again\n");
		}
	finally
		{
		System.out.println("finally....");
		}
	}while(continueLoop);
	}//end main
}//end class
