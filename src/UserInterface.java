import java.util.Scanner;
public class UserInterface {
    Scanner input = new Scanner(System.in);
    private MovieController movieController;

    public UserInterface() {
        movieController = new MovieController();
    }
    public void startProgram(){
        int choice = 0;

        while (choice != 4){
            showMenu();
            choice = input.nextInt();
            input.nextLine();

            if(choice == 1 ){
                addMovie();
            }
            else if (choice == 2) {
                movieController.getList();
            }
            else if (choice == 3){
                searchMovie();
            }
            else if (choice == 4) {
                System.out.println("Afslut");
            }
            else {
                System.out.println("Ugyldigt valg. Vælg et tal mellem 1-4!");
            }

        }
    }
    private void showMenu() {
        System.out.println("Velkommen til en 10/10 filmsamling");
        System.out.println("1. Opret en film");
        System.out.println("2. Vis liste af film");
        System.out.println("3. Søg efter film");
        System.out.println("4. Afslut");
        System.out.println("Indtast dit valg: ");

    }
    private void addMovie() {
        System.out.println("Enter film details:");
        System.out.println("Title:");
        String title = input.nextLine();
        System.out.println("Director:");
        String director = input.nextLine();
        System.out.println("Year:");
        int year = input.nextInt();
        input.nextLine(); // consume newline
        System.out.println("Genre:");
        String genre = input.nextLine();
        boolean isInColor = false;
        System.out.println("Is movie in color? Type yes, or no");
        String erIFarve = input.next();
        erIFarve = erIFarve.toLowerCase();
        if (erIFarve.equals("yes")) {
            isInColor = true;
        }
        System.out.print("Length in minutes: ");
        double lengthMinutes = input.nextDouble();
        input.nextLine(); // consume newline

        movieController.addMovie(title, director, year, genre, isInColor, lengthMinutes);
    }

    private void searchMovie() {
        System.out.println("Indtast søgning: ");
        String søgning = input.nextLine();
        movieController.searchMovie(søgning);
    }
    private void editMovie(){
        System.out.println("Indtast titel på den film du gerne vil redigere: ");
        String titleEdit = input.nextLine();
    }
}




