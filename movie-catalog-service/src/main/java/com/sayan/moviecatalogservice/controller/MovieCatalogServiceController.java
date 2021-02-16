package com.sayan.moviecatalogservice.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.sayan.moviecatalogservice.entity.CatalogEntity;

@RestController
public class MovieCatalogServiceController {
	public List<CatalogEntity> getCatalog(String userId) {
		return Collections.singletonList(
				new CatalogEntity("Pulp Fiction", "Prison Break", 4)
				);
	}
}
