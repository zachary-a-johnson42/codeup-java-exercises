package grades;
import util.Input;
import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        //hashmap for all students. Key is String, Value is a Student Object
        HashMap<String, Student> students = new HashMap<>();

        //Setting up 4 Student objects, with 3 grades.
        Student zach = new Student("Zach");
        zach.addGrade(100);
        zach.addGrade(70);
        zach.addGrade(80);

        Student jacob = new Student("Jacob");
        jacob.addGrade(90);
        jacob.addGrade(100);
        jacob.addGrade(80);

        Student darien = new Student("Darien");
        darien.addGrade(95);
        darien.addGrade(90);
        darien.addGrade(90);

        Student buddy = new Student("Buddy");
        buddy.addGrade(70);
        buddy.addGrade(65);
        buddy.addGrade(99);

        students.put("whiskeytango", zach);
        students.put("Fishing4Lyfe", jacob);
        students.put("chickenandrice", darien);
        students.put("thegoodestboy", buddy);


        //Setting up console printouts for user choice
        System.out.println("Welcome!");

        boolean userChoice = true;

        //Using do while loop, because I want it to run at least once
        //As long as the yes/no stays true, keep looping.
        //Break case is when the boolean is false, when a user types anything but yes it toggles.
        do {
            System.out.println("Here are the GitHub usernames of our students");

            //While building, it will show a bunch of errors. Just keep going and it'll quit complaining
            students.forEach(
                    (key, value)
                            //lambda expression!
                            -> System.out.printf("| %s ", key)
            );

            System.out.println("What student would you like more information on?");
            // Getting user input
            String studentInformation = Input.getString();
            // If key doesn't exist, throw an error.
            if (!students.containsKey(studentInformation)) {
                System.out.println("Student doesn't exist.");
            }

            if (students.containsKey(studentInformation)) {
                // Name and GitHub username
                System.out.printf("Name: %s - GitHub Username : %s%n", students.get(studentInformation).getName(), studentInformation);
                //Getting all grades
                System.out.println("Student's grades currently are..");
                System.out.println(students.get(studentInformation).getAllGrades());
                //Show student grade average
                System.out.printf("Current Average : %s%n", students.get(studentInformation).getGradeAverage());
                //Class average.
                System.out.println("Would you like to see class average?");
                boolean classAverageChoice = Input.yesNo();
                double classAverage = 0;
                if(classAverageChoice) {
                    //While building, it will show a bunch of errors. Just keep going and it'll quit complaining
                    for(Student value : students.values()){
                       classAverage += value.getGradeAverage();
                    }
                    }
                System.out.printf("Class average is %s%n", classAverage / students.size());
                }

                System.out.println("Would you like to see another student?");
                userChoice = Input.yesNo();

        } while (userChoice == true);
        System.out.println("Goodbye, have a nice day!");
    }
}
