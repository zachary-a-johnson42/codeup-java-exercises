import java.util.Scanner;

public class Bob {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ask Bob a question!");
        String userQuestion = scanner.nextLine();
        if(userQuestion.endsWith("?")){
            System.out.println("Bob says : \"Sure\"");
        } else if (userQuestion.endsWith("!")){
            System.out.println("Bob says : \"Whoa! Chill out!\"");
        } else if(userQuestion.equals("")){
            System.out.println("Bob says: \"Fine! Be that way!\"");
        } else {
            System.out.println("Bob says : \"Whatever.\"");
        }
    }
}
