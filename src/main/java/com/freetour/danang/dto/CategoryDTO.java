package com.freetour.danang.dto;

import com.freetour.danang.dao.models.Restaurant;

import java.util.List;

public class CategoryDTO {
    private Long id;
    private String name;
    private List<RestaurantDTO> restaurants;

    @Override
    public String toString() {
        return "CategoryDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", restaurants=" + restaurants +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RestaurantDTO> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<RestaurantDTO> restaurants) {
        this.restaurants = restaurants;
    }
}
