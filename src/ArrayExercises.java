import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercises {

    public static void addPerson(Person[] array){
        // to get user input for person name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the new Person");
        String newName = scanner.nextLine();
        //Getting a copy of the array argument, so we don't chance altering original array
        Person[] arrayCopy = Arrays.copyOf(array, array.length + 1);
        // Add new person, length should be +1? Hopefully no outofbounds error
        arrayCopy[3] = new Person(newName);
        //Print out to make sure it's working
        for (int i = 0; i < arrayCopy.length; i++) {
            System.out.printf("%s%n", arrayCopy[i].getName());
        }
    }

    public static void main(String[] args){
        // Array initializer syntax
        int[] numbers = {1, 2, 3, 4, 5};
        // Is this printing out the java compiled code?
        System.out.println(numbers);
        //Human readable
        String numbersString = Arrays.toString(numbers);
        System.out.println(numbersString);

        //Create array that holds 3 Person objects
        Person[] people = new Person[3];
        //Add 3 people into array
        people[0] = new Person("zach");
        people[1] = new Person("colly");
        people[2] = new Person("james");
        //Iterate through array, print out each person's name
        //EXPECTED RETURN zach colly james
        for (int i = 0; i < people.length; i++) {
            System.out.printf("%s%n", people[i].getName());
        }

        //create static method addPerson
        //Will take in a single person object to add, and an array of Person objects
        //Return a new array with +1 array length, with the new Person added.
        //EXPECT 4 NAMES
        addPerson(people);
    }
}
