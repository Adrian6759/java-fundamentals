package inheritance;

import reviews.reviews.Review;

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
    public void addReview(Review newReview) {
        if(!reviews.contains(newReview)) {
            reviews.add(newReview);


            int sumOfReviewStars = 0;
            for (Review restaurantReview : reviews) {
                sumOfReviewStars += restaurantReview.getStars();
            }

            this.stars = (float) sumOfReviewStars / (float) reviews.size();
        }
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


