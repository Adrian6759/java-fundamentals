package reviews.reviews;

import reviews.reviews.Review;

public class MovieReview extends Review {
    String movie;
    public MovieReview(String reviewBody, String author, int stars, String movie) {
        super(reviewBody, author, stars);
        this.movie = movie;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Movie Review{Movie:" + movie + '\'' +
                ", body: " + getText() + '\'' +
                ", author: " + getAuthor()+ '\'' +
                ", stars: " + getStars() + '\'' + "}";

    }
}
