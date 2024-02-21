import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner:
        Scanner input = new Scanner(System.in);
//input af data:
        System.out.println("Enter film details:");
        System.out.println("Title:");
        String title = input.nextLine();
        System.out.println("Director:");
        String director = input.nextLine();
        System.out.println("Year:");
        int year = input.nextInt();
        input.nextLine();
        System.out.println("Genre:");
        String genre = input.nextLine();
        System.out.print("Length (in minutes): ");
        double lengthMinutes = input.nextDouble();

        //movie object:
        Movie movie = new Movie(title , director, year, genre, lengthMinutes);

        //Print movie details
        System.out.println("Movie details:");
        System.out.println("Title: " + movie.getTitle());
        System.out.println("Director: " + movie.getDirector());
        System.out.println("Year: " + movie.getYear());
        System.out.println("Genre: " + movie.getGenre());
        System.out.println("Length in minutes: " + movie.getLengthInMinutes());

        //Use MovieCollection to manage movie objects
        MovieCollection movieCollection = new MovieCollection();

        //Add movie to collection
        movieCollection.addMovie(title, director, year, genre, lengthMinutes);
        input.close();

    }
}

