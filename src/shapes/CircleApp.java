package shapes;
import util.Input;

public class CircleApp {
    //Create counter property to track how many circles are made, read only
    private static int circleCounter = 1;

    //create prompt to get user to input radius, then inform them of area and circumference.
    public static void createCircle(){
        System.out.println("Lets create a circle! Enter the radius of your circle");
        int userRadius = Input.getInt();
        Circle userCircle = new Circle(userRadius);
        System.out.printf("We've made a new circle! Your circle's radius is %s%n", userRadius);
        System.out.printf("The area of your circle is %.2f%n", (float)userCircle.getArea());
        System.out.printf("The circumference of your circle is %.2f%n", (float)userCircle.getCircumference());
        //ask if they'd like to make another, if yes, go again.
        System.out.println("Would you like to create another circle? Answer Yes or No");
        //Might have trailing space on end of line, will try to consume.
        Input.getString();
        //if no, alert user of how many circles they made, end program;
        boolean userChoice = Input.yesNo();
        if(userChoice == true){
            howManyCircles();
            createCircle();
        }

        if(userChoice == false){
            System.out.printf("You have created %s circles! Thank you for playing.%n",circleCounter);
            circleCounter = 1;
        }
    }

    //public method to return how many circles were made
    public static int howManyCircles(){
        int howMany = circleCounter;
        circleCounter++;
        return howMany;
    }

    //main to run and test as I code
    public static void main(String[] args){
        createCircle();
    }
}


