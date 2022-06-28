package com.example.Hospital.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Office {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private int pin;

    @OneToMany(mappedBy = "office")
    @JsonIgnoreProperties(value = "office")
    private List<Patient> member;

    public Office(int pin) {
        this.pin = pin;
    }
}
