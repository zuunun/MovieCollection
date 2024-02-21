public class Movie {
    private String title;
    private String director;
    private int year;
    private String genre;
    private double lengthInMinutes;

    //Constructor til at initialisere movie objekt:
    public Movie (String title, String director, int year, String genre, double lengthInMinutes) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.genre = genre;
        this.lengthInMinutes = lengthInMinutes;
    }
    //Getter method to access attributes:

    public String getTitle() {
        return title;
    }
    public String getDirector() {
        return director;
    }
    public int getYear () {
        return year;
    }
    public String getGenre() {
        return genre;
    }
    public double getLengthInMinutes() {
        return lengthInMinutes;
    }
}
