package com.company.capgemini.pack.Exercises;

import com.company.capgemini.pack.Comparator.Student2;

import java.time.LocalDate;
import java.util.Comparator;

public class Movie implements Comparable<Movie> {
    private int movieId;

    int rating;
    private String movieName, genre;
    LocalDate releaseDate;

    public Movie() {

    }

    public Movie(int movieId, String movieName, String genre, LocalDate releaseDate) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    public Movie(int movieId, String movieName, String genre, LocalDate releaseDate, int rating) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.rating = rating;
    }

    public int getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getGenre() {
        return genre;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "MovieId=" + movieId +
                ", MovieName='" + movieName + '\'' +
                ", Genre='" + genre + '\'' +
                ", ReleaseDate=" + releaseDate +" | Rating="+rating+
                '}';
    }

    public int compareTo(Movie m) {
        if (releaseDate.equals(m.releaseDate))
            return 0;
        else if (releaseDate.isAfter(m.releaseDate)) {
            return 1;
        } else
            return -1;
    }
}
class RatingComparator implements Comparator<Movie>
{
    public int compare(Movie m1, Movie m2) {
        if(m1.rating == m2.rating)
            return 0;
        else if(m1.rating>m2.rating)
            return 1;
        else
            return -1;
    }
}


