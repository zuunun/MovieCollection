import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class MovieCollectionTest {

    @Test
    void addMovie() {
        //Triple A pattern
        //Arrange
        MovieCollection movieCollection = new MovieCollection();

        //Act
        movieCollection.add(new Movie("The Hunger Games", "Gary Ross", 2012, "Fiction",true, 1.42));
        int expectedMovie = 1;
        int actualMovie = movieCollection.getList().size(); // Assuming getList returns a list, call size() to get the count

        //Assert
        assertEquals(expectedMovie, actualMovie);
    }


    @Test
    void getList() {
        // Arrange
        MovieCollection movieCollection = new MovieCollection();
        Movie newMovie = new Movie("The Hunger Games", "Gary Ross", 2012, "Fiction", true, 1.42);
        movieCollection.add(new Movie("The Hunger Games: Catching Fire", "Francis Lawrence", 2013, "Fiction", true, 2.5));
        movieCollection.add(new Movie("The Hunger Games: Mockingjay", "Francis Lawrence", 2014, "Fiction", true, 1.4));
        movieCollection.add(newMovie);

        // Act
        ArrayList<Movie> actualList = movieCollection.getList();

        // Assuming getList returns the list of movies, check for one movie
        int expectedSize = 3;
        int actualSize = actualList.size();

        // You might want to further check if the actual list contains the added movie
        boolean isMoviePresent = actualList.contains(newMovie);
        // Assert
        assertEquals(expectedSize, actualSize);
        assertTrue(isMoviePresent); // The list should contain the added movie
    }
}