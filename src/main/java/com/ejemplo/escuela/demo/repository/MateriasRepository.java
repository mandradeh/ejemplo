package com.ejemplo.escuela.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejemplo.escuela.demo.model.Alumno;
import com.ejemplo.escuela.demo.model.Materia;

@Repository
public interface MateriasRepository extends JpaRepository<Materia, Integer>{
	List<Materia> findAll();
}
