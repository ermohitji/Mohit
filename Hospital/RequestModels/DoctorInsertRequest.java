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
public class DoctorInsertRequest {
    private String name;
    private List<Specialist> specialists;
    private Hospital hospital;

    public Doctor to(){
        return Doctor.builder()
                .name(this.name)
                .specialist(this.specialists)
                .hospital(this.hospital)
                .build();
    }
}
