package inheritance;

import java.util.ArrayList;

public class Theater {
    private String name;
    public float stars;
    private ArrayList<String> movies;
    private ArrayList<Review> movieReview;

    public Theater(String name) {
        this.name = name;
        this.stars = 0;
        this.movies = new ArrayList<String>();
        this.movieReview = new ArrayList<Review>();
    }


    public void addMovie(String newMovie) {

    }

    public void removeMovie(String movieToReview) {

    }
}
