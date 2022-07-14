package util;
import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public static String getString(){
        System.out.println("Enter your sentence");
        return scanner.nextLine();
    }

    public static boolean yesNo(){
        System.out.println("If you would like to continue, please type \"Yes\"");
        String userString = Input.getString();

        if(userString.equalsIgnoreCase("y") || userString.equalsIgnoreCase("yes")){
            return true;
        }
        return false;
    }

    public static int getInt(){
        System.out.println("Input a number");
        int userInt = scanner.nextInt();
        return userInt;
    }

    //Overloaded method to set range for number...
    public static int getInt(int min, int max){
        System.out.printf("Input a number between %s and %s%n", min, max);
        int userInt = scanner.nextInt();

        if(userInt < min || userInt > max){
            System.out.println("Number is not in given ranges, please try again");
            getInt(min, max);
        }
        return userInt;
    }

    public static double getDouble(){
        System.out.println("Enter a number with decimal placements");
        double userDouble = scanner.nextDouble();
        return userDouble;
    }

    //Overloaded method to set range, same as getInt
    public static double getDouble(double min, double max) {
        System.out.printf("Enter a number with decimal placement between %s and %s%n", min, max);
        double userDouble = scanner.nextDouble();

        if(userDouble < min || userDouble > max){
            System.out.println("Number is not in given range, please try again");
            getDouble(min, max);
        }

        return userDouble;
    }

}
