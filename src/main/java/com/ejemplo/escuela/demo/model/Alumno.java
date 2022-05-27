/**
 * 
 */
package com.ejemplo.escuela.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * @author Admin
 *
 */
@Entity
@Table(name = "t_alumnos")
@EntityListeners(AuditingEntityListener.class)
public class Alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_t_usuarios")
	private Integer idTUsuarios;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "ap_paterno")
	private String apPaterno;
	
	@Column(name = "ap_materno")
	private String apMaterno;
	
	@Column(name = "activo")
	private Integer activo;
	
	/**
	 * 
	 */
	public Alumno() {
		super();
		this.idTUsuarios = 0;
		this.nombre = "";
		this.apPaterno = "";
		this.apMaterno = "";
		this.activo = 0;
	}
	

	public Alumno(Integer idAlumno, String nombre, String apPaterno, String apMaterno, Integer activo) {
		super();
		this.idTUsuarios = idAlumno;
		this.nombre = nombre;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.activo = activo;
	}



	public Integer getIdTUsuarios() {
		return idTUsuarios;
	}


	public void setIdTUsuarios(Integer idTUsuarios) {
		this.idTUsuarios = idTUsuarios;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public Integer getActivo() {
		return activo;
	}


	public void setActivo(Integer activo) {
		this.activo = activo;
	}


	@Override
	public String toString() {
		return "Alumno [idAlumno=" + idTUsuarios + ", nombre=" + nombre + ", apPaterno=" + apPaterno + ", apMaterno="
				+ apMaterno + ", activo=" + activo + "]";
	}

	
}
