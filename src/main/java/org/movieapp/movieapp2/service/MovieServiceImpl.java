package org.movieapp.movieapp2.service;


import org.movieapp.movieapp2.dao.MovieDao;
import org.movieapp.movieapp2.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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


}
