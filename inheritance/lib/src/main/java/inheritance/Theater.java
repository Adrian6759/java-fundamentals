package inheritance;

import reviews.reviews.MovieReview;

import java.util.ArrayList;

public class Theater {
    private String name;
    private float stars;
    private ArrayList<String> movies;
    private ArrayList<MovieReview> reviews;

    public Theater(String name, float stars) {
        this.name = name;
        this.stars = 0;
        this.movies = new ArrayList<String>();
        this.reviews = new ArrayList<MovieReview>();
    }


    public void addMovie(String newMovie) {
        if(!movies.contains(newMovie)) {
            movies.add(newMovie);
        }
    }

    public void removeMovie(String movieToRemove) {
        if(movies.contains(movieToRemove))
            movies.remove(movieToRemove);
    }
    public void addReview(Review newReview) {
        if(!reviews.contains(newReview)) {
            reviews.add(newReview);


            int sumOfReviewStars = 0;
            for (Review theaterReview : reviews) {
                sumOfReviewStars += theaterReview.getStars();
            }

            this.stars = (float) sumOfReviewStars / (float) reviews.size();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getStars() {
        return stars;
    }

    public void setStars(float stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Review: " + name + " with a star rating of " + stars;
    }
}
