package inheritance;

import reviews.reviews.Review;

import java.util.ArrayList;

public class Shop {
    private String name;
    private String description;
    private String priceCategory;
    private float stars;
    private ArrayList<Review> reviews;

    //constructor
    public Shop(String name, String description, String priceCategory) {
        this.name = name;
        this.description = description;
        this.priceCategory = priceCategory;
        this.stars = 0;
        this.reviews = new ArrayList<Review>();
    }

    // Methods
    public void addReview(Review newReview) {
        if(!reviews.contains(newReview)) {
            reviews.add(newReview);


            int sumOfReviewStars = 0;
            for (Review shopReview : reviews) {
                sumOfReviewStars += shopReview.getStars();
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

    public void setStars(float stars) {
        this.stars = stars;
    }
    public void getStars(float stars) {
        this.stars = stars;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {

        return "Review: " + name + " " + description + " with a price category of " + priceCategory;
    }
}
