package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String price;
    private float stars;
    private ArrayList<Review> reviews;


    public Restaurant(String name, String price) {
        this.name = name;
        this.price = price;
        this.stars = 0;
        this.reviews = new ArrayList<>();
    }

    //Methods
    public void addReview(Review review) {
        int sumOfReviewStars = 0;
        // 1. Add it to reviews List
        reviews.add(review);
        // 2. iterate over and get total sum of values
        for (Review arrayReview : reviews) {
            sumOfReviewStars += arrayReview.getStars();
        }
        // 3. calculate averageNum of stars
        float averageNumOfStars = (sumOfReviewStars / reviews.size());
        // 4. call setNumOfStars with new value
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
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public float getStars() {
        return stars;
    }

    public void setStars(Float stars) {
        this.stars = stars;
    }
    @Override
    public String toString() {
        return "Review: " + name + " with a price rating of " + price + " and star rating is " + stars;
    }
}


