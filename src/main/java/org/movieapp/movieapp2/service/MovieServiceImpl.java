package org.movieapp.movieapp2.service;


import org.movieapp.movieapp2.dao.MovieDao;
import org.movieapp.movieapp2.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieDao movieDao;
    @Override
    public List<Movie> getAllMovies() {
        return movieDao.findAll();
    }

    @Override
    public Movie getMovieById(int id) {
        return movieDao.findById(id).orElse(null);
    }

    @Override
    public Movie saveMovie(Movie movie) {
        return movieDao.save(movie);
    }

    @Override
    public void deleteMovie(int id) {
        movieDao.deleteById(id);
    }

    @Override
    public Movie updateMovie(int id, Movie movie) {
        Optional<Movie> existingMovie = movieDao.findById(id);
        if (existingMovie.isPresent()) {
            Movie updatedMovie = existingMovie.get();
            updatedMovie.setTitre(movie.getTitre());
            updatedMovie.setDateSortie(movie.getDateSortie());
            updatedMovie.setGenre(movie.getGenre());
            updatedMovie.setRealisateur(movie.getRealisateur());
            updatedMovie.setNote(movie.getNote());
            return movieDao.save(updatedMovie);
        } else {
            return null;
        }
    }

}
