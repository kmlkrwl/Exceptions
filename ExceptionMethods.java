import java.util.Scanner;

public class ExceptionMethods
{
	public static int quotient(int numerator, int denominator)
	{
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
