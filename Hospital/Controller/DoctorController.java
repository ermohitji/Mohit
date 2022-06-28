package com.example.Hospital.Controller;

import com.example.Hospital.Entity.Doctor;
import com.example.Hospital.RequestModels.DoctorInsertRequest;
import com.example.Hospital.Services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {
    @Autowired
    DoctorService doctorService;

    @PostMapping("/doctor")
    public void insertDoctor(@RequestBody Doctor doctor){
        doctorService.insertDoctor(doctor);
    }
}
