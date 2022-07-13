import java.lang.Math;
import java.util.Scanner;

public class HighLow {

    public static void numberToGuess(){
        //Scanner to get user input
        Scanner scanner = new Scanner(System.in);
        // Make number between 1 and 100
        int highLowNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Welcome to HighLow! We've picked a number between 1-100.");
        System.out.println("You have 7 tries to try to guess the number. Good luck!");
        // Set up a for loop to track number of guess remaining.
        for (int i = 7; i >= 0; i--) {
            if( i > 0) {
                System.out.printf("You have %s guesses remaining.%n", i);
            }
            if (i == 0) {
                System.out.println("This is your final bonus guess!");
            }
            System.out.println("Enter your number to guess");
            // Get user guess
            int userGuess = scanner.nextInt();

            // Control flow for user guess
            if (i == 0){
                System.out.printf("Out of guesses! The number to guess was %s", highLowNumber);
            } else if(userGuess < highLowNumber){
                System.out.println("Higher!");
            } else if (userGuess > highLowNumber)
            {
                System.out.println("Lower");
            } else if (userGuess == highLowNumber) {
                System.out.println("Great guess!");
            }
        }
    }

    public static void main(String[] args){
        numberToGuess();
    }
}
