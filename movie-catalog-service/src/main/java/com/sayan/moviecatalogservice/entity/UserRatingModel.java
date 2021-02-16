package com.sayan.moviecatalogservice.entity;

import java.util.List;

public class UserRatingModel {
    private List<RatingDataEntity> list;

    public UserRatingModel() {
    }

    public UserRatingModel(List<RatingDataEntity> list) {
        this.list = list;
    }

    public List<RatingDataEntity> getList() {
        return list;
    }

    public void setList(List<RatingDataEntity> list) {
        this.list = list;
    }
}
