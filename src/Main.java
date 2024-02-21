import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Scanner:
        Scanner input = new Scanner(System.in);
        //Use MovieController to manage movie objects
        MovieController movieController = new MovieController();
        int choice;

        //Sentinel loop
        while (true) {
            System.out.println("Velkommen til min filmsamling");
            System.out.println("1. Opret en film");
            System.out.println("2. Afslut");

            System.out.println("Indtast dit valg: ");
            choice = input.nextInt();
            input.nextLine();



//input af data:
            if (choice ==1) {

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
                Movie movie = new Movie(title, director, year, genre, lengthMinutes);

                //Print movie details
                System.out.println("Movie details:");
                System.out.println("Title: " + movie.getTitle());
                System.out.println("Director: " + movie.getDirector());
                System.out.println("Year: " + movie.getYear());
                System.out.println("Genre: " + movie.getGenre());
                System.out.println("Length in minutes: " + movie.getLengthInMinutes());


                //Add movie to collection
                movieController.addMovie(title, director, year, genre, lengthMinutes);
                input.close();

            }
            else if (choice ==2){
                System.out.println("Aflutter program");
            }
            else {
                System.out.println("Ugyldig valgt. Indtast et tal mellem 1 og 2");
            } break;
            }
        }
    }



