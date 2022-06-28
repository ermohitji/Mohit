package com.example.Hospital.Controller;

import com.example.Hospital.Entity.Office;
import com.example.Hospital.Services.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/office")
public class OfficeController {
    @Autowired
    OfficeService officeService;

    @PostMapping("/insert")
    public void insertOffice(@RequestParam int pin){
        officeService.insertOffice(pin);
    }
}
