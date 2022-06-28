package com.example.Hospital.Services;

import com.example.Hospital.Entity.Doctor;
import com.example.Hospital.Repository.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    @Autowired
    DoctorRepo doctorRepo;

    public void insertDoctor(Doctor doctor){
        doctorRepo.save(doctor);
    }
}
