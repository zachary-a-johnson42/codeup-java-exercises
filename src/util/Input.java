package util;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public static String getString(){
        return scanner.nextLine();
    }

    public static boolean yesNo(){
        String userString = Input.getString();

        if(userString.equalsIgnoreCase("y") || userString.equalsIgnoreCase("yes")){
            return true;
        }
        return false;
    }

    public static int getInt(){
        System.out.println("Enter a number");
        String userInput = Input.getString();
        try {
            Integer userIntParsed = Integer.valueOf(userInput);
            return userIntParsed;
        } catch (Exception e) {
            System.out.println("Value provided was not a valid number. Please try again");
        }
        return getInt();
    }

    //Overloaded method to set range for number...
    public static int getInt(int min, int max){
        System.out.printf("Input a number between %s and %s%n", min, max);
        String userInt = Input.getString();
        try{
            Integer userIntParsed = Integer.valueOf(userInt);
            if(userIntParsed < min || userIntParsed > max){
                System.out.println("Number is not in given ranges, please try again");
                getInt(min, max);
            }
            return userIntParsed;
        } catch(Exception e) {
            System.out.println("Number input was invalid, please try again");
        }
        return getInt(min, max);
    }

    public static double getDouble(){
        System.out.println("Please enter number.");
        String userDouble = Input.getString();

        try{
            double userDoubleParsed = Double.valueOf(userDouble);
            return userDoubleParsed;
        } catch(Exception e){
            System.out.println("Number given was not valid, please try again");
        }
        return getDouble();
    }

    //Overloaded method to set range, same as getInt
    public static double getDouble(double min, double max) {
        System.out.printf("Enter a number with decimal placement between %s and %s%n", min, max);

        String userDouble = Input.getString();

        try {
            Integer userDoubleParsed = Integer.valueOf(userDouble);

            if(userDoubleParsed < min || userDoubleParsed > max){
                System.out.println("Number is not in given range, please try again");
                getDouble(min, max);
            }
            return userDoubleParsed;
        } catch(Exception e) {
            System.out.println("Number entered was not valid, please try again");
        }

        return getDouble(min, max);
    }

    public static Integer getByte() {
        System.out.println("Enter your number to be converted to a byte");
        String userInput = Input.getString();

        try{
            Integer userInputParsed = Integer.valueOf(userInput, 2);
            return userInputParsed;
        } catch (Exception e) {
            System.out.println("Input could not be converted to byte. Please try again");
        }
        return getByte();
    }

    public static Integer  getHex() {
        System.out.println("Enter your number to be converted to a hex");
        String userInput = Input.getString();

        try{
            Integer userInputParsed = Integer.valueOf(userInput, 16);
            return userInputParsed;
        } catch (Exception e) {
            System.out.println("Input could not be converted to hex. Please try again");
        }
        return getHex();
    }
}
