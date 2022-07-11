import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        //Set up scanner, print out float
        Scanner scanner = new Scanner(System.in);

        //Need this for bonus? Thought it might fix my skipped input
        //scanner.useDelimiter("\n");

        double pi = 3.14159;
        System.out.printf("The shortened version of pi is %.2f%n", pi);

        //Print out number, as an int and not a string?
        System.out.println("Enter a number");
        int userNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("You have entered %s%n", userNumber);
        //Trying to add nextLine to consume the leftovers from nextInt?

        // This is somehow breaking my nextLine..

        System.out.println("Enter 3 words");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.printf("Your words were, %s, %s, and %s%n",word1, word2, word3);

        // This is necessary, it's eating up some weird leftover stuff on a line.
        // If it's not in the code, nextLine completely skips, and I can't put in a sentence
        scanner.nextLine();

        System.out.println("Enter a sentence");
        String userSentence = scanner.nextLine();
        System.out.printf("Your sentence was %s%n", userSentence);

        System.out.println("Enter the width of your classroom.");
        double classWidth = scanner.nextDouble();
        System.out.println("Enter the classroom's length");
        double classLength = scanner.nextDouble();
        double classArea = classLength * classWidth;
        double classPerimeter = (classLength * 2) + (classWidth * 2);
        System.out.printf("The classroom's area is %s, and the classroom's perimeter is %s", classArea , classPerimeter);

        //bonus stuff..
        //1. Use nextInt. DONE.
        //2. Accept decimals.
        //3. Ask about the weird delimiter. If I use that, can I avoid have to use nextLine to trim "trailing whitespace"?
    }
}
