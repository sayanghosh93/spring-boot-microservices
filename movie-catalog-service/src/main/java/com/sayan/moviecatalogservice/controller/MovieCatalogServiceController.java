package com.sayan.moviecatalogservice.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.sayan.moviecatalogservice.entity.MovieEntity;
import com.sayan.moviecatalogservice.entity.RatingDataEntity;
import com.sayan.moviecatalogservice.entity.UserRatingModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sayan.moviecatalogservice.entity.CatalogEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogServiceController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private WebClient.Builder webClientBuilder;

	@GetMapping("/{userId}")
	public List<CatalogEntity> getCatalog(@PathVariable("userId") String userId) {

		UserRatingModel ratings = restTemplate.getForObject("http://localhost:8083/ratingsdata/users/" + userId, UserRatingModel.class);

		return ratings.getList().stream().map(rating ->{
					MovieEntity movie = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(), MovieEntity.class);
					return new CatalogEntity(movie.getName(), "Test Description", rating.getRating());
		})
		.collect(Collectors.toList());
	}
}

/*MovieEntity movie = webClientBuilder.build()
							.get()
							.uri("http://localhost:8082/movies/" + rating.getMovieId())
							.retrieve()
							.bodyToMono(MovieEntity.class)
							.block();*/
