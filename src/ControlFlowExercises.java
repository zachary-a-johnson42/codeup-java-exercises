import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       // int counter = 0;
       // long squareCounter = 2;

//        while(i <= 15){
//            System.out.printf("The current value of i is %s%n", i);
//            i++;
//        }
//
//        do {
//            System.out.printf("Counter is at %s%n", counter);
//            counter += 2;
//        }
//        while(counter < 100);
//
//        do {
//            System.out.printf("Counter is at %s%n", counter);
//            counter -= 5;
//        }
//        while(counter >= -10);
//
//        do {
//            System.out.printf("Square counter is at %s%n",squareCounter);
//            squareCounter *= squareCounter;
//
//        }
//        while(squareCounter <= 1000000);

        for (int i = 5; i <= 15; i++) {
            System.out.printf("Value of i is %s%n", i);
        }

        for (int i = 0; i <= 100 ;) {
            System.out.printf("Value of i is %s%n", i);
            i += 2;
        }

        for (int i = 100; i >= -10 ;) {
            System.out.printf("Value of i is %s%n", i);
            i -=5;
        }

        for (long i = 2; i < 1000000; i = i * i) {
            System.out.printf("Value of i is %s%n", i);
        }

        for (int i = 0; i <= 100; i++) {
            if(i % 5 == 0 && i % 3 == 0){
                System.out.println("FizzBuzz!");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

        // https://stackoverflow.com/questions/15215326/how-can-i-create-table-using-ascii-in-a-console
        System.out.println("What number would you like to go up to?");
        int userNumber = scanner.nextInt();
        String  leftAlignFormat = "| %-4d | %-6d  | %-5d%n";
        System.out.format("number | squared | cubed%n");
        System.out.format("------ | ------- | -----%n");
        for (int i = 1; i <= userNumber; i++) {
            System.out.format(leftAlignFormat, i, i * i, i * i * i);
        }
        System.out.format("-------------------------%n");

        System.out.println("Enter a grade number, from 0-100");
        int gradeNumber = scanner.nextInt();

        if(gradeNumber > 100 || gradeNumber < 0) {
            System.out.println("You didn't enter a valid number");
        } else if(gradeNumber >= 88){
            System.out.println("Grade letter is A");
        } else if(gradeNumber >= 80) {
            System.out.println("Grade letter is B");
        } else if (gradeNumber >= 67) {
            System.out.println("Grade letter is C");
        } else if (gradeNumber >= 60){
            System.out.println("Grade letter is D");
        } else if (gradeNumber <= 59 && gradeNumber > 0) {
            System.out.println("Grade letter is F");
        }

    }
}
