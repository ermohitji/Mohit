package com.example.Hospital.Repository;

import com.example.Hospital.Entity.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface
OfficeRepo extends JpaRepository<Office,Integer> {
    @Query(value = "select a from Office a where a.pin=:pin")
    Office findOffice(@Param(value="pin") int pin);
}
