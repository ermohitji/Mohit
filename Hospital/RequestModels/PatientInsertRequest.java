package com.example.Hospital.RequestModels;

import com.example.Hospital.Entity.Gender;
import com.example.Hospital.Entity.Patient;
import com.example.Hospital.Entity.Specialist;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PatientInsertRequest {
    private String patientName;
    private byte[] adhaarCard;
    private Gender gender;
    private List<Specialist>specialists;
    public Patient to(){
        return Patient.builder()
                .patientName(patientName)
                .gender(gender)
                .adhaarCard(adhaarCard)
                .specialists(specialists)
                .build();
    }
}
