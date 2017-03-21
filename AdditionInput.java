
// An addition program 

import java.util.Scanner;  // program uses class Scanner

public class AdditionInput {
   public static void main( String args[] )
   {
	Scanner input = new Scanner(System.in);      
	int number1;		          // first number to add
         	int number2;		         // second number to add
         	int sum;           		// sum of number1 and number2

	//prompt the user to input the first number
      	System.out.print("Enter first integer: ");
	// read in first number from user as a string
      	number1 = input.nextInt( );
	
	//do the same for the second number
      	System.out.print("Enter second integer: ");
	number2 = input.nextInt( );
	
	//add them
     	sum = number1 + number2;

     	// display the results
     	System.out.printf("Sum is %d\n", sum);
   }
}
