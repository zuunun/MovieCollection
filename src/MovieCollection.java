public class MovieCollection {
    //class with an array of movies:
    private Movie[] movies;
    private int count;

    //constructor til at initialisere MovieCollection med pladser til 5
    public MovieCollection () {
        movies =new Movie[5];
        count =0;
    }
    //metode addmovie to collection:
    public void addMovie (String title, String director, int year, String genre, double lengthInMinutes) {
        Movie movie = new Movie(title, director, year, genre, lengthInMinutes);
        //tjek array
        //if (count> movies.length) {
        //movies[count] = movie;
        //count++;
        //System.out.println("Movie added: " + movie.getTitle());
        //}
        //else {
        //System.out.println("Can't add anymore. Movie collection is full");
    }
}


