public class Movie {
    //String attribute
    private String title;
    private String director;
    private String genre;
    private int year;
    private boolean isInColor;
    private double lengthInMinutes;

    public Movie(String title, String director, int year, String genre, boolean isInColor, double lengthInMinutes) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.genre = genre;
        this.isInColor = isInColor;
        this.lengthInMinutes = lengthInMinutes;
    }

    @Override
    public String toString() {
        return "Movie: " + title +
                ", Director: " + director +
                ", Year: " + year +
                ", Genre: " + genre +
                ", Color: " + (isInColor ? "Yes" : "No") +
                ", Length: " + lengthInMinutes + " minutes";
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

    //setter
    public void setTite(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setIsInColor(boolean isInColor) {
        this.isInColor = isInColor;
    }

    public void setLengthInMinutes(double lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }
}



