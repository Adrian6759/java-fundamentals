package inheritance;

public class Review {
    private String reviewBody;
    private String author;
    private int numStars;

    public Review(String reviewBody, String author, int numStars) {
        this.reviewBody = reviewBody;
        this.author = author;
        this.numStars = numStars;
    }

    public String getText() {
        return reviewBody;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumOfStars() {
        return numStars;
    }

    @Override
    public  String toString() {
        return "Review: " + reviewBody + "By " + author + "star rating is " + numStars;
    }
}
