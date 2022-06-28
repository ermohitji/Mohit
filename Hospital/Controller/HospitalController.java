package com.example.Hospital.Controller;

import com.example.Hospital.Entity.Hospital;
import com.example.Hospital.RequestModels.HospitalInsertRequest;
import com.example.Hospital.Services.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
    @Autowired
    HospitalService hospitalService;
    @PostMapping("/insert")
    public void insertHospital(@RequestBody Hospital hospital){
        hospitalService.createHospital(hospital);
    }
}
