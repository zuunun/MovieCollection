public class MovieController {
    private final MovieCollection movieCollection;

    public MovieController() {
        this.movieCollection = new MovieCollection(); // Initialize movieCollection
    }

    public String addMovie(String title, String director, int year, String genre, boolean isInColor, double lengthInMinutes) {
        return movieCollection.addMovie(title, director, genre, year, isInColor, lengthInMinutes);
    }

    public void printList() {
        movieCollection.printList();
    }

    public void searchMovie(String title) {
        movieCollection.searchMovie(title);
    }

    public void editMovie(String title) {
        movieCollection.editMovie(title);
    }




}



