package org.movieapp.movieapp2.service;

import org.movieapp.movieapp2.model.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> getAllMovies();
    Movie getMovieById(int id);
    Movie saveMovie(Movie movie);
    void deleteMovie(int id);
    Movie updateMovie(int id, Movie movie);
}