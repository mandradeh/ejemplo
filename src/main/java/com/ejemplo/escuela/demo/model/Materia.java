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
@Table(name = "t_materias")
@EntityListeners(AuditingEntityListener.class)
public class Materia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_t_materias")
	private int idMateria;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "activo")
	private int activo;
	/**
	 * 
	 */
	public Materia() {
		super();
		this.idMateria = 0;
		this.nombre = "";
		this.activo = 0;
	}
	
	public Materia(int idMateria, String nombre, int activo) {
		super();
		this.idMateria = idMateria;
		this.nombre = nombre;
		this.activo = activo;
	}

	public int getIdMateria() {
		return idMateria;
	}
	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getActivo() {
		return activo;
	}
	public void setActivo(int activo) {
		this.activo = activo;
	}
	@Override
	public String toString() {
		return "Materia [idMateria=" + idMateria + ", nombre=" + nombre + ", activo=" + activo + "]";
	}

}
