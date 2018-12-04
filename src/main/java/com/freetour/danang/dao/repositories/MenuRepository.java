package com.freetour.danang.dao.repositories;

import com.freetour.danang.dao.models.Menu;
import com.freetour.danang.dao.models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MenuRepository extends JpaRepository<Menu, Long> {
    @Query(value = "SELECT * FROM menu,restaurant WHERE restaurant_id = ?1", nativeQuery = true)
    Restaurant listByIda(Long id);
}
