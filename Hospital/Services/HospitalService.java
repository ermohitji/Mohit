package com.example.Hospital.Services;

import com.example.Hospital.Entity.Hospital;
import com.example.Hospital.Repository.HospitalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalService {
    @Autowired
    HospitalRepo hospitalRepo;

    public void createHospital(Hospital hospital){
        hospitalRepo.save(hospital);
    }

}
