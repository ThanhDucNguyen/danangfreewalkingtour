package com.freetour.danang.dao.repositories;

import com.freetour.danang.dao.models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    @Query(value = "select * from restaurant where category_id=1 ", nativeQuery = true)
    List<Restaurant> findEat();
    @Query(value = "select * from restaurant where category_id=2 ", nativeQuery = true)
    List<Restaurant> findDrink();
    @Query(value = "SELECT * FROM restaurant WHERE restaurant_id = ?1", nativeQuery = true)
    Restaurant listById(Long id);
}
