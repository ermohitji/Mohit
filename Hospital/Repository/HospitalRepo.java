package com.example.Hospital.Repository;

import com.example.Hospital.Entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepo extends JpaRepository<Hospital,Integer> {

    @Query(value = "select a from Hospital a where a.id = :id")
    Hospital findHospital(@Param(value = "id") int id);

}
