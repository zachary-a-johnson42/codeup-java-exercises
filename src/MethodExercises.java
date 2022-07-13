import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class MethodExercises {

    public static long Addition(long firstNum, long secondNum){
        return firstNum + secondNum;
    }

    public static long Subtraction(long firstNum, long secondNum){
        return firstNum - secondNum;
    }

    public static long Multiplication(long firstNum, long secondNum){

        //Make sure there's no multiply by 0
        if(firstNum == 0 || secondNum == 0){
            return 0;
        }

        //My second number is my "counter" for how many times I need to add.

        if(secondNum > 0){
            // counter - 1
            secondNum -= 1;
            //add the first number, the number to be multiplied, with my recursive call(which will be the same number)
            //Until my counter hits 0, and I have my final number.

            //How is this not affecting it? Like if 2*3 it's not going 2,4,8?
            return firstNum + Multiplication(firstNum, secondNum);
        }
        //This is where I return my final number when counter = 0
        if (secondNum <= 0){
            return firstNum;
        }
        //this has to be here because it screams if I don't have a return statement in the body.
        //maybe I can use void?
        return Multiplication(firstNum,secondNum);
    }

    public static long Division(long numToDivide, long divideBy){
        return numToDivide / divideBy;
    }

    public static long Modulus(long numToMod, long modNum){
        return numToMod % modNum;
    }

    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between %s, and %s%n", min, max);
        int userInput = scanner.nextInt();
        if(userInput <= min || userInput >= max){
            System.out.println("Invalid number, please try again");
        }
        else if(userInput > min && userInput < max){
            return userInput;
        }
        return getInteger(min,max);
    }

    public static long getFactorial(){
        Scanner scanner = new Scanner(System.in);
        long userFactorial = getInteger(1,10);
        System.out.printf("You have chose %s. Would you like to continue?%n", userFactorial);
        System.out.println("Please enter Yes or No");
        String userChoice = scanner.next();

        if(userChoice.equalsIgnoreCase("no")){
           System.out.println("You've chosen no. Goodbye");
        }

        else if(userChoice.equalsIgnoreCase("yes")){
            int factorial = 1;
            for (int i = 1; i <= userFactorial ; i++) {
                factorial *= i;
            }
            System.out.printf("%s! = %s%n",userFactorial,factorial);
            return factorial;
        }
        else{
            System.out.println("Invalid entry. Goodbye.");
        }

        return userFactorial;
    }

    public static void diceRolling(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's roll a pair of dice! How many sides does the dice have?");
        int min = 1;
        int diceMax = scanner.nextInt();
        int firstDie = (int) (Math.random() * diceMax) + min;
        int secondDie = (int) (Math.random() * diceMax) + min;
        System.out.printf("You have chosen a %s die.%n", diceMax);
        System.out.printf("Your first die rolled a %s! Your second die roll a %s!%n", firstDie, secondDie);
        System.out.printf("You're combined roll is %s%n", firstDie + secondDie);

    }

    public static void main(String[] args){
        long added = Addition(2,2);
        long subtracted = Subtraction(10,2);
        long multed = Multiplication(7,5);
        long dived = Division(10,2);
        long modded = Modulus(10,3);

        System.out.println(added);
        System.out.println(subtracted);
        System.out.println(multed);
        System.out.println(dived);
        System.out.println(modded);
        getFactorial();
        diceRolling();
    }
}
