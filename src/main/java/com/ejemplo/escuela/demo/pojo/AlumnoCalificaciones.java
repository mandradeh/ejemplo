/**
 * 
 */
package com.ejemplo.escuela.demo.pojo;

import java.time.LocalDate;

import com.ejemplo.escuela.demo.model.Alumno;
import com.ejemplo.escuela.demo.model.Calificacion;

/**
 * @author Admin
 *
 */
public class AlumnoCalificaciones {

	/**
	 * 
	 */
	
	private Integer id_t_usuario;
	private String nombre;
	private String apellido;
	private String materia;
	private float calificacion;
	private LocalDate fechaRegistro;
	
	public AlumnoCalificaciones(Alumno alumno, Calificacion calificacion) {
		super();
		this.id_t_usuario = alumno.getIdTUsuarios();
		this.nombre = alumno.getNombre();
		this.apellido = alumno.getApPaterno();
		this.materia = calificacion.getMateria().getNombre();
		this.calificacion = calificacion.getCalificacion();
		this.fechaRegistro = calificacion.getRegistroDate();
	}

	public AlumnoCalificaciones(Integer id_t_usuario, String nombre, String apellido, String materia,
			float calificacion, LocalDate fechaRegistro) {
		super();
		this.id_t_usuario = id_t_usuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.materia = materia;
		this.calificacion = calificacion;
		this.fechaRegistro = fechaRegistro;
	}

	public Integer getId_t_usuario() {
		return id_t_usuario;
	}

	public void setId_t_usuario(Integer id_t_usuario) {
		this.id_t_usuario = id_t_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public float getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(float calificacion) {
		this.calificacion = calificacion;
	}

	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

}
