package com.example.Hospital.RequestModels;

import com.example.Hospital.Entity.Specialist;
import lombok.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpecialistInsertRequest {
    private int id;
    private String name;
    public Specialist to(){
        return Specialist.builder()
                .id(id)
                .name(name)
                .build();
    }
}
