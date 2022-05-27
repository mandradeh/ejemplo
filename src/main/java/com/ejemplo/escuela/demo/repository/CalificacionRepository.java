/**
 * 
 */
package com.ejemplo.escuela.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ejemplo.escuela.demo.model.Alumno;
import com.ejemplo.escuela.demo.model.Calificacion;

/**
 * @author Admin
 *
 */
@Repository
public interface CalificacionRepository extends JpaRepository<Calificacion, Integer>{
	
	List<Calificacion> findCalificacionesByAlumno(@Param("idTUsuarios") Alumno alumno);
	
	Calificacion findByIdCalificacion(@Param("idCalificacion") Integer idCalificacion);
}
