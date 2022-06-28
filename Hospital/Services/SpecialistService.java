package com.example.Hospital.Services;

import com.example.Hospital.Entity.Specialist;
import com.example.Hospital.Repository.SpecialistRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpecialistService {
    @Autowired
    SpecialistRepo specialistRepo;

    public void createSpecialist(Specialist specialist){
        specialistRepo.save(specialist);
    }

}
