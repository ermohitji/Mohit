package com.example.Hospital.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Hospital {

    @Id
    private int id;

    @OneToMany(mappedBy = "hospital")
    @JsonIgnoreProperties(value ="hospital")
    private List<Specialist> specialists;

    @OneToMany(mappedBy = "hospital")
    @JsonIgnoreProperties(value ="hospital")
    private List<Doctor> doctors;
}
