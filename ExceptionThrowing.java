import java.util.Scanner;

public class ExceptionThrowing
{
	public static int quotient(int numerator, int denominator) throws IllegalArgumentException
	{
		if(denominator == 0)
			throw new IllegalArgumentException("The divisor can not be zero");
		return numerator/denominator;
		
	}

	public static void main(String[] args)
	{
	Scanner scanner = new Scanner(System.in);
	try
		{
		System.out.printf("Please enter an integer numerator: ");
		int numerator = scanner.nextInt();
		System.out.printf("Please enter an integer denominator: ");
		int denominator = scanner.nextInt();

		int result = quotient(numerator, denominator);
		System.out.printf("\nResult: %d/%d = %d\n", numerator, denominator, result);
		}
	catch(Exception ex)
		{
		System.out.printf("\nThe exception is: " + ex.getMessage());
		System.out.printf("\nThe call stack is: " );
		ex.printStackTrace();
		}
	finally 
		{
		System.out.println("finally....");
		}
	}
}
