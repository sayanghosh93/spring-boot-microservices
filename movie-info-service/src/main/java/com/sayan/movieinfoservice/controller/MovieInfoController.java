package com.sayan.movieinfoservice.controller;

import com.sayan.movieinfoservice.entity.MovieEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {

    @RequestMapping("{movieId}")
    public MovieEntity getMovieInfo(@PathVariable("movieId") String movieId) {
        return new MovieEntity(movieId, "Test Name");
    }
}
