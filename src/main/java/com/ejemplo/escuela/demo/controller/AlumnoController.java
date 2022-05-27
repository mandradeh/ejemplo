/**
 * 
 */
package com.ejemplo.escuela.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.escuela.demo.model.Alumno;
import com.ejemplo.escuela.demo.repository.AlumnoRepository;

/**
 * @author Admin
 *
 */
@RestController
@RequestMapping("/api")
public class AlumnoController {

	@Autowired
	private AlumnoRepository alumnoRepo;
	
	@GetMapping("/alumnos")
	public List<Alumno> allAlumnos(){
		return alumnoRepo.findAll();
	}
	@GetMapping("/alumno/nombre/{nombre}")
	public List<Alumno> findByNombre(@PathVariable("nombre") String name){
		return alumnoRepo.findByNombre(name);
	}
	@GetMapping("/alumno/id/{id}")
	public Alumno findById(@PathVariable("id") Integer id){
		return alumnoRepo.findByIdTUsuarios(id);
	}


}
