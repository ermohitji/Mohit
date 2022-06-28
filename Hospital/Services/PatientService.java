package com.example.Hospital.Services;

import com.example.Hospital.Entity.Hospital;
import com.example.Hospital.Entity.Patient;
import com.example.Hospital.Entity.Specialist;
import com.example.Hospital.Repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {
    @Autowired
    PatientRepo patientRepo;

    @Autowired
    SpecialistService specialistService;

    public void insertPatient(Patient patient){
        patientRepo.save(patient);
    }




}
