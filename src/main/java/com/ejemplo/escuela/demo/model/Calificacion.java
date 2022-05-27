/**
 * 
 */
package com.ejemplo.escuela.demo.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * @author Admin
 *
 */
@Entity
@Table(name = "t_calificaciones")
@EntityListeners(AuditingEntityListener.class)
public class Calificacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_t_calificaciones")
	private int idCalificacion;
	
	@ManyToOne(optional = false,  fetch = FetchType.EAGER )
	@JoinColumn(name="id_t_materias")
	private Materia materia;
	
	@ManyToOne(optional = false,  fetch = FetchType.EAGER )
	@JoinColumn(name="id_t_usuarios")
	private Alumno alumno;
	
	@Column(name = "calificacion")
	private float calificacion;
	
	@Column(name = "fecha_registro")
	private LocalDate registro;

	/**
	 * 
	 */
	public Calificacion() {
		super();
		this.idCalificacion = 0;
		this.materia = new Materia();
		this.alumno = new Alumno();
		this.calificacion = 0.0f;
		this.registro = LocalDate.now();
	}
	

	public Calificacion(int idCalificacion, Materia materia, Alumno alumno, float calificacion, LocalDate registro) {
		super();
		this.idCalificacion = idCalificacion;
		this.materia = materia;
		this.alumno = alumno;
		this.calificacion = calificacion;
		this.registro = registro;
	}


	public int getIdCalificacion() {
		return idCalificacion;
	}

	public void setIdCalificacion(int idCalificacion) {
		this.idCalificacion = idCalificacion;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public float getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(float calificacion) {
		this.calificacion = calificacion;
	}

	/*public LocalDate getRegistro() {
		return registro;
	}*/
	public LocalDate getRegistroDate() {
		return registro;
	}
	public String getRegistro() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.registro.format(formatter);
	}

	public void setRegistro(LocalDate registro) {
		this.registro = registro;
	}
	
	

}
