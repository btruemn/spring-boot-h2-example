package com.example.demo.repository;

import com.example.demo.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UserRepository extends JpaRepository<AppUser, Long> {
    @Query(value = "CALL get_user_count(:userCount)", nativeQuery = true)
    Integer callGetUserCountProcedure();
}
