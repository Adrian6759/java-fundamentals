package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String priceCategory;
    private float stars;
    private ArrayList<Review> reviews;


    public Restaurant(String name, String priceCategory) {
        this.name = name;
        this.priceCategory = priceCategory;
        this.stars = 0;
        this.reviews = new ArrayList<Review>();
    }

    //Methods
    public void addReview(Review review) {
        int sumOfReviewStars = 0;

        reviews.add(review);

        for (Review arrayReview : reviews) {
            sumOfReviewStars += arrayReview.getStars();
        }

        float averageNumOfStars = (sumOfReviewStars / reviews.size());

        setStars(averageNumOfStars);
    }


    //Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return priceCategory;
    }

    public void setPrice(String price) {
        this.priceCategory = price;
    }

    public float getStars() {
        return stars;
    }

    public void setStars(Float stars) {
        this.stars = stars;
    }
    @Override
    public String toString() {
        return "Review: " + name + " with a price rating of " + priceCategory + " and star rating is " + stars;
    }
}


