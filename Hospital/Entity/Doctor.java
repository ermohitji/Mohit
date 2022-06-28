package com.example.Hospital.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Doctor {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    private String name;

    @OneToMany(mappedBy = "doctor")
    @JsonIgnoreProperties(value = "doctor")
    private List<Specialist> specialist;

    @ManyToOne
    @JoinColumn
    @JsonIgnoreProperties(value = "specialist")
    private Hospital hospital;
}


