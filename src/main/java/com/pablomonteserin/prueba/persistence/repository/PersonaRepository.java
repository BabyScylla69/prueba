package com.pablomonteserin.prueba.persistence.repository;

import com.pablomonteserin.prueba.entities.Persona;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonaRepository extends CrudRepository<Persona, Integer> {
    List<Persona> findAll();
}
