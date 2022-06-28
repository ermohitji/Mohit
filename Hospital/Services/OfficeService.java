package com.example.Hospital.Services;

import com.example.Hospital.Entity.Office;
import com.example.Hospital.Repository.OfficeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfficeService {

    @Autowired
    OfficeRepo officeRepo;
    public void insertOffice(int pin){
        Office officeFromDb = officeRepo.findOffice(pin);
        if(officeFromDb == null)
            officeRepo.save(new Office(pin));
    }
}
