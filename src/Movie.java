public class Movie {
    //String attribute
    private String title;
    private String director;
    private String genre;
//int attribute
    private int year;
//boolean & double attribute
    private boolean isInColor;
    private double lengthInMinutes;

    //Denne er konstruktøren, der tager en række parametre for at oprette en ny filmobject
    public Movie(String title, String director, int year, String genre, boolean isInColor, double lengthInMinutes) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.genre = genre;
        this.isInColor = isInColor;
        this.lengthInMinutes = lengthInMinutes;
    }

    // Denne metode, som overskriver den standard toString-metode, returnerer en streng med detaljerede oplysninger
    // om filmens titel, år, genre, om filmen er i farve, og filmens længde i minutter.
    @Override
    public String toString() {
        String colorYesOrNo = isInColor ? "Er film i farve?: ja" : "Er film i favre?: nej";
        return "Filmtitel: " + title + "\n" + "Director: " + director + "\n"+ "Årstal: " + year + "\n" + "Genre: " + genre + "\n" +
                colorYesOrNo + "\n" + "Længde i minutter: " + lengthInMinutes + " min\n";
    }

    //Getter method to access attributes:
    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isInColor() {
        return isInColor;
    }

    public double getLengthInMinutes() {
        return lengthInMinutes;
    }
}

/*public static void main(String[] args) {
    UserInterface vi = new UserInterface();
    ui.startProgram();
}/*

//This class is a model or data holder for the concept of a movie in your program,
// holding properties like title, director, year, genre, etc. It is a blueprint for creating Movie objects with
// these properties. The Movie class also overrides the toString method to provide a string representation of
// Movie objects, which is useful when you want to print movie details.

/*@Override
public String toString() {
    String colorStatement = isInColor ? "Farvet?: ja" : "Farvet?: nej";
    return "Filmtitel: " + title + "\n" +
            "Årstal: " + year + "\n" +
            "Genre: " + genre + "\n" +
            colorStatement + "\n" +
            "Længde i minutter: " + lengthInMinutes + " min\n";*/
