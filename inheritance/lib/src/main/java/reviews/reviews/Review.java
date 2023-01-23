package reviews.reviews;

public class Review {
    private String reviewBody;
    private String author;
    private int stars;

    public Review(String reviewBody, String author, int numStars) {
        this.reviewBody = reviewBody;
        this.author = author;
        this.stars = stars;
    }

    public String getText() {
        return reviewBody;
    }

    public String getAuthor() {
        return author;
    }

    public int getStars() {
        return stars;
    }

    @Override
    public  String toString() {
        return "Review: " + reviewBody + "Author " + author + "star rating is " + stars;
    }
}
