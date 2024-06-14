package org.movieapp.movieapp2.dao;

import org.movieapp.movieapp2.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieDao extends JpaRepository<Movie, Integer> {
}
