package com.example.Hospital.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.awt.image.BufferedImage;
import java.sql.Blob;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Patient {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    private String patientName;

    @Lob
    private byte[]
            adhaarCard;

    private Gender gender;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Specialist> specialists;

    @ManyToOne
    @JoinColumn
    @JsonIgnoreProperties(value = "patient")
    private Office office;

}
