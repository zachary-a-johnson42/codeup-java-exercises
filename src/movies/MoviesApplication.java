package movies;
import util.Input;

//import static movies.MoviesArray.findAll;

public class MoviesApplication {
    public static void main(String[] args) {

        //MoviesArray isn't falling into the movies package for some reason? I have to do a weird import..

        Movie[] allMovies = MoviesArray.findAll();

        System.out.println("Choose an option");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view all movies in the animated category");
        System.out.println("3 - view all movies in the comedy category");
        System.out.println("4 - view all movies in the drama category");
        System.out.println("5 - view all movies in the horror category");
        System.out.println("6 - view all movies in the musical category");
        System.out.println("7 - view all movies in the sci-fi category");

        int userOption = Input.getInt();

        switch (userOption) {
            case 0:
                break;
            case 1:
                for (int i = 0; i < allMovies.length; i++) {
                    System.out.printf("Name: %s Category : %s%n", allMovies[i].getName(), allMovies[i].getCategory());
                }
                break;
            case 2:
                for (int i = 0; i < allMovies.length; i++) {
                    if (allMovies[i].getCategory().equals("animated")) {
                        System.out.printf("Name: %s Category: %s%n", allMovies[i].getName(), allMovies[i].getCategory());
                    }
                }
                break;
            case 3:
                for (int i = 0; i < allMovies.length; i++) {
                    if (allMovies[i].getCategory().equalsIgnoreCase("comedy")) {
                        System.out.printf("Name: %s Category: %s%n", allMovies[i].getName(), allMovies[i].getCategory());
                    }
                }
                break;
            case 4:
                for (int i = 0; i < allMovies.length; i++) {
                    if (allMovies[i].getCategory().equals("drama")) {
                        System.out.printf("Name: %s Category: %s%n", allMovies[i].getName(), allMovies[i].getCategory());
                    }
                }
                break;
            case 5:
                for (int i = 0; i < allMovies.length; i++) {
                    if (allMovies[i].getCategory().equals("horror")) {
                        System.out.printf("Name: %s Category: %s%n", allMovies[i].getName(), allMovies[i].getCategory());
                    }
                }
                break;
            case 6:
                for (int i = 0; i < allMovies.length; i++) {
                    if (allMovies[i].getCategory().equals("musical")) {
                        System.out.printf("Name: %s Category: %s%n", allMovies[i].getName(), allMovies[i].getCategory());
                    }
                }
                break;
            case 7:
                for (int i = 0; i < allMovies.length; i++) {
                    if (allMovies[i].getCategory().equals("scifi")) {
                        System.out.printf("Name: %s Category: %s%n", allMovies[i].getName(), allMovies[i].getCategory());
                    }
                }
                break;

            default: break;
        }
    }
}