import java.util.ArrayList;
import java.util.Scanner;

public class MovieCollection {
    private ArrayList<Movie> movieCollection;
    Scanner scanner = new Scanner(System.in);

    public MovieCollection() {
        movieCollection = new ArrayList<>();
        movieCollection.add(new Movie("Inception", "Christopher Nolan", 2010, "Action", true, 2.28));
        movieCollection.add(new Movie("The Hunger Games", "Gary Ross", 2012, "Fiction", true, 1.42));
        movieCollection.add(new Movie("The hunger games: Catching Fire", "Zuhur", 2013, "Fiction", true, 1.46));
        movieCollection.add(new Movie("The Hunger Games: Mockingjay – Part 1", "Zuhur", 2014, "Fiction", true, 1.23));
        movieCollection.add(new Movie("The Hunger Games: Mockingjay – Part 2", "Zuhur", 2015, "Fiction", true, 1.37));
    }

    public void add(Movie movie) {
        movieCollection.add(movie);
    }

    public String addMovie(String title, String director, String genre, int year, boolean isInColor, double lengthInMinutes) {
        movieCollection.add(new Movie(title, director, year, genre, isInColor, lengthInMinutes));
        return title + "was added to the collection!";
    }

    public ArrayList<Movie> getList() {
        return movieCollection;
    }

    public void printList() {
        System.out.println("list of movies");
        for (Movie m : movieCollection) {
            System.out.println(m.toString());
        }
    }


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


    public void editMovie(String title) {
        boolean continueEditing = true;

        while (continueEditing) {
            boolean hasFound = false;


            for (Movie m : movieCollection) {
                if (m.getTitle().equalsIgnoreCase(title)) {
                    System.out.println("Enter new movie details:");
                    System.out.println("Director");
                    String newDirector = scanner.nextLine();
                    System.out.println("Year:");
                    int newYear = scanner.nextInt();
                    System.out.println("Genre: ");
                    String newGenre = scanner.nextLine();
                    System.out.println("Is movie in color? Type yes or no: ");
                    String newColor = scanner.nextLine().toLowerCase();
                    boolean newIsInColor = newColor.equals("yes");
                    System.out.println("Length in minutes: ");
                    double newLengthInMinutes = scanner.nextDouble();
                    scanner.nextLine();

                    //Update new movie details:
                    m.setDirector(newDirector);
                    m.setYear(newYear);
                    m.setGenre(newGenre);
                    m.setIsInColor(newIsInColor);
                    m.setLengthInMinutes(newLengthInMinutes);

                    System.out.println("Movie details updated.");
                    System.out.println(m.toString());
                    hasFound = true;
                }
            }
            if (!hasFound) {
                System.out.println("No movies found to edit.");
            }
            System.out.println("Would you like to edit further? Type yes or no:");
            String userChoice = scanner.nextLine();
            continueEditing = userChoice.equalsIgnoreCase("yes");

            if (continueEditing) {
                System.out.println("Enter title to edit:");
                title = scanner.nextLine();

            } else {
                System.out.println("Program has ended");
                scanner.close();
            }
        }
    }
}







