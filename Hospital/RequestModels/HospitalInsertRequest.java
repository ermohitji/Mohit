package com.example.Hospital.RequestModels;

import com.example.Hospital.Entity.Doctor;
import com.example.Hospital.Entity.Hospital;
import com.example.Hospital.Entity.Specialist;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class HospitalInsertRequest {

    private List<Doctor> doctors;

    private List<Specialist> specialists;

    public Hospital to(){
        return Hospital.builder()
                .doctors(this.doctors)
                .specialists(this.specialists)
                .build();
    }
}
