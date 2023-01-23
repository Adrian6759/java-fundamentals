package inheritance;

import java.util.ArrayList;

public class Shop {
    private String name;
    private String description;
    private String priceCategory;
    private float stars;
    private ArrayList<Review> reviews;

    //constructor
    public Shop(String name, String description, String priceCategory, ArrayList<Review> reviews) {
        this.name = name;
        this.description = description;
        this.priceCategory = priceCategory;
        this.stars = 0;
        this.reviews = new ArrayList<>();
    }

    // Methods
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
