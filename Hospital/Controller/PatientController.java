package com.example.Hospital.Controller;

import com.example.Hospital.Payload.FileResponse;
import com.example.Hospital.RequestModels.PatientInsertRequest;
import com.example.Hospital.Services.FileService;
import com.example.Hospital.Services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    PatientService patientService;
    @Autowired
    private FileService fileService;
    @Value("${project.image}")
    private String path;



    @PostMapping("/insert")
    public void insertPatient(@RequestBody PatientInsertRequest patientInsertRequest){
        patientService.insertPatient(patientInsertRequest.to());
    }

}
