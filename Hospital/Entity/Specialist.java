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
public class Specialist {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @Column(unique = true)
    private String name;

    @ManyToOne
    @JoinColumn
    @JsonIgnoreProperties(value = "specialist")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn
    @JsonIgnoreProperties(value = "specialist")
    private Hospital hospital;


    public Specialist(String name) {
        this.name = name;
    }
}
