package com.pablomonteserin.prueba.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
//@Table(name = "persons")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int age;
}
