public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int myFavoriteNumber = 19;
        System.out.println(myFavoriteNumber);
        String myString = "Sphinx of black quartz, judge my vow!";
        System.out.println(myString);
        /*Why you need to explicitly cast float
        * https://stackoverflow.com/questions/52069115/java-why-we-need-to-cast-a-float-but-not-a-double#:~:text=By%20default%2C%20Java%20compiler%20perceives,are%20declaring%20a%20float%20variable. */
        float myNumber = 3.14f;
        System.out.println(myNumber);
        //Narrowing Conversion
        int almostPi = (int) myNumber;
        System.out.println(almostPi);
    }
}
