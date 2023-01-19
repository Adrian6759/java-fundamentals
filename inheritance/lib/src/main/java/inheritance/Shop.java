package inheritance;

import java.util.ArrayList;

public class Shop {
    private String name;
    private String description;
    private String price;
    private ArrayList<Review> reviews;

    //constructor
    public Shop(String name, String description, String price, ArrayList<Review> reviews) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.reviews = new ArrayList<>();
    }

    // Methods

    //Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriceCategory() {
        return price;
    }

    public void setPriceCategory(String priceCategory) {
        this.price = priceCategory;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Restaurant info";
    }
}
