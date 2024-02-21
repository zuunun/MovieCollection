import java.util.ArrayList;
import java.util.Scanner;
//controller class til at manage movie collection
public class MovieController {
    private MovieCollection movieCollection;

    public MovieController() {
        this.movieCollection = new MovieCollection();
    }

    public void addMovie(String titel, String director, int year, String genre, double lengthInMinutes) {
       Movie newMovie = new Movie(titel, director, year, genre, lengthInMinutes);
       movieCollection.addMovie(newMovie);
        System.out.println("Movie is added");
    }
}
    //MovieController class responsible for managing the movie collection.




