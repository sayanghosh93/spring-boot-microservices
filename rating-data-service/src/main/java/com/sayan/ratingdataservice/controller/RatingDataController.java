package com.sayan.ratingdataservice.controller;

import com.sayan.ratingdataservice.entity.RatingDataEntity;
import com.sayan.ratingdataservice.entity.UserRatingModel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingDataController {

    @RequestMapping("{movieId}")
    public RatingDataEntity getRatings(@PathVariable("movieId") String movieId) {
        return new RatingDataEntity(movieId, 4);
    }

    @RequestMapping("users/{userId}")
    public UserRatingModel getUserRatings(@PathVariable("userId") String userId) {
        return new UserRatingModel(Arrays.asList(
                new RatingDataEntity("1234", 4),
                new RatingDataEntity("5678", 3)
        ));
    }
}
