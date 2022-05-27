/**
 * 
 */
package com.ejemplo.escuela.demo.repository;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ejemplo.escuela.demo.model.Alumno;

/**
 * @author Admin
 *
 */
@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{
	List<Alumno> findByNombre(@Param("nombre") String nombre);
	
	List<Alumno> findAll();
	
	Alumno findByIdTUsuarios(@Param("idTUsuarios") Integer id);
}
