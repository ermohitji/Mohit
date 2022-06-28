package com.example.Hospital.Repository;

import com.example.Hospital.Entity.Specialist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialistRepo extends JpaRepository<Specialist,Integer> {
}
