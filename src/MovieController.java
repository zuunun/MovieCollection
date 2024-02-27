//controller class til at manage movie collection
public class MovieController {
    private MovieCollection movieCollection;

    public MovieController() {
        movieCollection = new MovieCollection();
    }

    public String addMovie(String title, String director, int year, String genre, boolean isInColor, double lengthInMinutes) {
        return movieCollection.addMovie(title, director, genre, year, isInColor, (int) lengthInMinutes);
    }

    public void getList() {
        movieCollection.getList();
    }

    public void searchMovie(String title) {
        movieCollection.searchMovie(title);
    }
}
//MovieController class responsible for managing the movie collection.
//responsibility assignment
//This is a controller class as per the Model-View-Controller pattern.
// It serves as an intermediary between the MovieCollection (Model) and the user interaction handled in
// the Main class (View). The MovieController exposes methods related to movie operations which are
// utilized by the Main class. This design makes your program more modular. Code in the Main class doesn't
// need to know how movies are stored, it just needs to interact with the MovieController.




