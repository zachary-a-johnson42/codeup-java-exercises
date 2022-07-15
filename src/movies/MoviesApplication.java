package movies;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args){
        //Get all movies
        Movie[] allmovies = findAll();
        for (int i = 0; i < allmovies.length; i++) {
            System.out.printf("%s : %s%n", allmovies[i].getName(), allmovies[i].getCategory());
        }


    }
}