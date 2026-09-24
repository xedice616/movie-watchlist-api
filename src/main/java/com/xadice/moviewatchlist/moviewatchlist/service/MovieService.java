package com.xadice.moviewatchlist.moviewatchlist.service;

import com.xadice.moviewatchlist.moviewatchlist.model.Movie;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    private final List<Movie> movies = new ArrayList<>();
//yeni movie əlavə olunanda avtomatik ID vermək üçündür.
    private Long nextId = 1L;

    public MovieService() {

        movies.add(
                new Movie(
                        nextId++, "Interstellar", "Sci-Fi", 2014, true));

        movies.add(
                new Movie(nextId++, "Inception", "Sci-Fi", 2010, false));
    }

    public List<Movie> getAllMovies() {
        return movies;
    }

    public Movie getMovieById(Long id) {

        for (Movie movie : movies) {

            if (movie.getId().equals(id)) {
                return movie;
            }

        }

        return null;
    }

    public Movie addMovie(Movie movie) {

        movie.setId(nextId++);

        movies.add(movie);

        return movie;
    }
}
