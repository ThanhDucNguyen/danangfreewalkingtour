package com.freetour.danang.dao.repositories;

import com.freetour.danang.dao.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query(value = "select * from users where username=?1 and password=?2", nativeQuery = true)
    User findByAdmin(String userName, String password);
}
