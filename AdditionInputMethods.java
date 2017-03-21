
// An addition program 

import java.util.InputMismatchException;
import java.util.Scanner;  // program uses class Scanner

public class AdditionInputMethods {

	   private static Scanner input = new Scanner(System.in);
	public static void main( String args[] )
	{

		int number1;		          // first number to add
		int number2;		         // second number to add
		int sum;           		// sum of number1 and number2

		//prompt the user to input the first number
//      	System.out.print("Enter first integer: ");
//	// read in first number from user as a string
//      	number1 = input.nextInt( );
		number1 = readFirstNumber();
		//do the same for the second number
		number2 = readSecondNumber();

		//add them
		sum = number1 + number2;

		// display the results
		System.out.printf("Sum is %d\n", sum);
	}
	//Reads an integer from the user and prints error if the user enters number instead of
	private static int inputNumber()
	{
		boolean notDone = true; //for loop to continue until number is recieved.
		int number = 0;
		do
		{
			try
			{
				number = input.nextInt();
				notDone = false;
			} //end try
			catch (InputMismatchException ex)
			{
				ex.printStackTrace();
				System.out.println("Error! Please Enter an Integer");
				input.next(); //flush last entry
			}
		} while(notDone);
		return number;
   }

   private static int readFirstNumber() {
	   System.out.println("Please Enter First Number: ");
	   return inputNumber();
   }

	private static int readSecondNumber() {
		System.out.println("Please Enter Second Number: ");
		return inputNumber();
	}
}
