import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by kamalkarwal on 21/3/17.
 */
public class AdditionInputException {


    private static Scanner input = new Scanner(System.in);
    public static void main( String args[] ) {

        int number1 = 0;		          // first number to add
        int number2 = 0;		         // second number to add
        int sum;           		// sum of number1 and number2
        boolean notDone = true;
        do {
            try {
                number1 = readFirstNumber();
                number2 = readSecondNumber();
                notDone = false;
            } catch (InputIntException ex) {
                ex.printStackTrace();
            }
        } while (notDone);

        //add them
        sum = number1 + number2;

        // display the results
        System.out.printf("Sum is %d\n", sum);
    }
    //Reads an integer from the user and prints error if the user enters number instead of
    private static int inputNumber() throws InputIntException {
        int num;
        if(input.hasNextInt()) {
            num = input.nextInt();
        } else {
            input.next(); //flush
            throw new InputIntException();
        }
        return num;
    }

    private static int readFirstNumber() throws InputIntException {
        System.out.println("Please Enter First Number: ");
        return readNumber();
    }

    private static int readSecondNumber() throws InputIntException{
        System.out.println("Please Enter Second Number: ");
        return readNumber();
    }

    private static int readNumber() throws InputIntException {
        try{
            return inputNumber();
        } catch (InputIntException ex){
            throw ex;
        }
    }
}
