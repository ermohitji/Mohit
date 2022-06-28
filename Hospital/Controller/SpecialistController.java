package com.example.Hospital.Controller;

import com.example.Hospital.RequestModels.SpecialistInsertRequest;
import com.example.Hospital.Services.SpecialistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SpecialistController {
    @Autowired
    SpecialistService specialistService;

    @PostMapping("/specialist")
    public void insertSpecialist(@RequestBody SpecialistInsertRequest specialistInsertRequest){
        specialistService.createSpecialist(specialistInsertRequest.to());
    }
}
