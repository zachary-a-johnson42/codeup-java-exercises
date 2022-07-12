public class StringExercise {
    public static void main(String[] args){
        //Multiline print?
        String brickInTheWall = "We don't need no education";
        brickInTheWall += "%n";
        brickInTheWall += "We don't need no thought control%n";
        System.out.printf(brickInTheWall);

        //Escape Characters
        String quotesInQuotes = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(quotesInQuotes);

        String windowsMain = "In windows, the main drive is usually C:\\";
        System.out.println(windowsMain);

        String multiBackslash = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!";
    }
}
