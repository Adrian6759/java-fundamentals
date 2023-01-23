package inheritance;

public class MovieReview extends Review{
    String movie;
    public MovieReview(String reviewBody, String author, int numStars, String movie) {
        super(reviewBody, author, numStars);
        this.movie = movie;
    }
}
