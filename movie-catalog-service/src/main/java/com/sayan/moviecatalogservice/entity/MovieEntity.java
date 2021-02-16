package com.sayan.moviecatalogservice.entity;

public class MovieEntity {
    private String movieId;
    private String name;

    public MovieEntity(String movieId, String name) {
        this.movieId = movieId;
        this.name = name;
    }

    public MovieEntity() {
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
