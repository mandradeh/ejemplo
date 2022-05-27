/**
 * 
 */
package com.ejemplo.escuela.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.escuela.demo.model.Alumno;
import com.ejemplo.escuela.demo.model.Calificacion;
import com.ejemplo.escuela.demo.model.Materia;
import com.ejemplo.escuela.demo.pojo.PromedioCalificacion;
import com.ejemplo.escuela.demo.repository.AlumnoRepository;
import com.ejemplo.escuela.demo.repository.MateriasRepository;

/**
 * @author Admin
 *
 */

@RestController
@RequestMapping("/api")
public class MateriaController {

	@Autowired
	private MateriasRepository materiasRepo;
	
	@GetMapping("/materias")
	public List<Materia> allAlumnos(){
		return materiasRepo.findAll();
	}

}
