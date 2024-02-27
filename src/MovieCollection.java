import java.util.ArrayList;
public class MovieCollection {
    //class with an array of movies:
    private ArrayList<Movie> movieCollection;

    //Constructor, der opretter nyt ArrayList af Movie objekter og tilføjer to film ved initiering
    public MovieCollection() {
        movieCollection = new ArrayList<>();
        movieCollection.add(new Movie("Inception", "Christopher Nolan", 2010, "Action",
                true, 2.28));
        movieCollection.add(new Movie("The Hunger Games", "Gary Ross", 2012, "Fiction",
                true, 1.42));
        movieCollection.add(new Movie("The hunger games: Catching Fire", "Zuhur", 2013,
                "Fiction", true, 1.46));
        movieCollection.add(new Movie("The Hunger Games: Mockingjay – Part 1", "Zuhur", 2014,
                "Fiction", true, 1.23));
        movieCollection.add(new Movie("The Hunger Games: Mockingjay – Part 2", "Zuhur", 2015,
                "Fiction", true, 1.37));

    }

    //Denne metode tilføjer en ny film til samlingen og returnerer en streng med bekræftelsen.
    public String addMovie(String title, String director, String genre, int year, boolean isInColor, int lengthInMinutes) {
        movieCollection.add(new Movie(title, director, year, genre, isInColor, lengthInMinutes));
        return title + "was added to the collection!";
    }

    //Denne metode printer en liste over alle filmene i samlingen til konsollen.
    public void getList() {
        System.out.println("list of movies");
        for (Movie m : movieCollection) {
            System.out.println(m.toString());
        }
    }

    //Denne metode søger efter en film med en specifik titel i samlingen og printer resultaterne til konsollen,
    // eller meddeler, at der ikke blev fundet nogen match.
    //contains: Returns true if this list contains the specified element.
    public void searchMovie(String title) {
        boolean hasFound = false;
        System.out.println("Search results can be seen below:");

        for (Movie m : movieCollection) {
            if (m.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println(m);
                hasFound = true;
            }
        }
        if (!hasFound) {
            System.out.println("No matches found in movie collection");
        }
    }
}
// This class is like a database of movies represented as an ArrayList of Movie objects.
// It provides interface methods to manipulate (add, get list, search) the collection of movies.

//creator iforhold til movie
//information expert ifh til liste af movie
//arraylist og filme og add til liste




