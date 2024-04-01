import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner = new Scanner(System.in);
    private final MovieController movieController;

    public UserInterface() {
        this.movieController = new MovieController();
    }

    public void startProgram() {
        System.out.print("\u001B[35m"); // Set text color to purple
        System.out.println("   🌸🌼🌺🌻🌷🌹🏵️🌸🌼🌺🌻🌷🌹🏵️🌸🌼🌺🌻🌷🌹🏵️");
        System.out.println("  🌺                                            🌺");
        System.out.println(" 🌸 WELCOME TO THE WORLD'S BEST MOVIE COLLECTION  🌸");
        System.out.println("  🌼                                            🌼");
        System.out.println("   🏵️🌹🌷🌻🌺🌼🌸🏵️🌹🌷🌻🌺🌼🌸🏵️🌹🌷🌻🌺🌼🌸  \u001B[0m");
        showMenu();
        String userChoice;

        do {
            System.out.print("Insert your demand or type help for instructions: ");
            userChoice = getStringInput().toLowerCase();

            switch (userChoice) {
                case "add":
                    addMovie();
                    break;
                case "list":
                    movieController.printList();
                    break;
                case "search":
                    searchMovie();
                    break;
                case "edit":
                    editMovie();
                    break;
                case "remove":
                    removeMovie();
                case "help":
                    showMenu();
                    break;
                case "exit":
                    System.out.println("\u001B[35m──────────────────────────────────────────────────────");
                    System.out.println("              Exiting Movie Collection                ");
                    System.out.println("──────────────────────────────────────────────────────\u001B[0m");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!userChoice.equals("exit"));
    }

    private void showMenu() {
        System.out.println("Here are the following options:");
        System.out.println("🌺'Add': to add a new movie");
        System.out.println("🌺'List': for list of movies");
        System.out.println("🌺'Search': Search for movie");
        System.out.println("🌺'Edit': To edit movie");
        System.out.println("🌺'Remove': To remove movie");
        System.out.println("🌺'Exit': to exit program");
    }

    private String getStringInput() {
        try {
            String inputString = scanner.nextLine().trim().toLowerCase();
            if (inputString.isEmpty()) {
                System.out.println("That didn't work. Try again.");
                return getStringInput();
            }
            return inputString;
        } catch (InputMismatchException e) {
            System.out.println("That didn't work. Try again.");
            scanner.nextLine(); // Consume the invalid input
            return getStringInput();
        }
    }
    private void removeMovie(){
        System.out.println("Enter title to remove: ");
        String title = scanner.nextLine();
        movieController.removeMovie(title);
    }

    private void addMovie() {
        System.out.println("---------Add film details below---------");

        System.out.print("Title: ");
        String title = scanner.nextLine();

        System.out.print("Director: ");
        String director = scanner.nextLine();

        System.out.print("Year: ");
        int year = getIntegerInput();

        System.out.print("Genre: ");
        String genre = scanner.nextLine();

        System.out.print("Is the movie in color? Type yes/no: ");
        boolean isInColor = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.print("Length in minutes: ");
        double lengthMinutes = getDoubleInput();

        movieController.addMovie(title, director, year, genre, isInColor, lengthMinutes);
    }


    private void searchMovie() {
        System.out.print("Enter search: ");
        String search = scanner.nextLine();
        movieController.searchMovie(search);
    }

    private void editMovie() {
        System.out.print("Enter title to edit: ");
        String edit = scanner.nextLine();
        movieController.editMovie(edit);
    }

    private int getIntegerInput() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer value.");
            scanner.nextLine(); // Consume the invalid input
            return getIntegerInput();
        }
    }

    private double getDoubleInput() {
        try {
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.nextLine(); // Consume the invalid input
            return getDoubleInput();
        }
    }
}






