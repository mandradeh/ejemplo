/**
 * 
 */
package com.ejemplo.escuela.demo.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.escuela.demo.model.Alumno;
import com.ejemplo.escuela.demo.model.Calificacion;
import com.ejemplo.escuela.demo.pojo.PromedioCalificacion;
import com.ejemplo.escuela.demo.pojo.RespuestaEscuela;
import com.ejemplo.escuela.demo.repository.AlumnoRepository;
import com.ejemplo.escuela.demo.repository.CalificacionRepository;

/**
 * @author Admin
 *
 */
@CrossOrigin( origins = "*" )
@RestController()
@RequestMapping("/api")
public class CalificacionController {

	@Autowired
	private CalificacionRepository calificacionRepo;
	
	@Autowired
	private AlumnoRepository alumnoRepo;
	
	@GetMapping("/calificaciones/calificacion/{idCalificacion}")
	public Calificacion findByIdCalificacion(@PathVariable("idCalificacion") Integer idCalificacion){
		
		
		return calificacionRepo.findByIdCalificacion(idCalificacion);
	}
	
	@GetMapping("/calificaciones/{idAlumno}")
	public PromedioCalificacion findByIdAlumno(@PathVariable("idAlumno") Integer idAlumno){
		
		Alumno alumno = alumnoRepo.findByIdTUsuarios(idAlumno);
		List<Calificacion> calificaciones = calificacionRepo.findCalificacionesByAlumno(alumno);
		
		PromedioCalificacion respuesta = new PromedioCalificacion(calificaciones, 0.0f);
		
		return respuesta;
	}
	
	
	@PutMapping("/calificaciones/actualiza/{idCalificacion}")
	public RespuestaEscuela updatePerson(@PathVariable Integer idCalificacion ,@RequestBody Calificacion calificacion) {
		calificacion.setRegistro(LocalDate.now());
		calificacionRepo.save(calificacion);
		return new RespuestaEscuela("ok","Calificacion Actualizada!");
	}
	@DeleteMapping("/calificaciones/elimina/{idCalificacion}")
	public RespuestaEscuela deletePerson(@PathVariable("idCalificacion") Integer id) {
		calificacionRepo.deleteById(id);
		return new RespuestaEscuela("ok","Calificacion Eliminada!");
	}
	@PostMapping("/calificaciones/new")
	public RespuestaEscuela createPerson(@RequestBody Calificacion calificacion) {
		calificacionRepo.save(calificacion);
		return new RespuestaEscuela("ok","Calificacion registrada!");
	}
}
