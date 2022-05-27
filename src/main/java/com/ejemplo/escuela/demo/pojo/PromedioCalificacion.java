/**
 * 
 */
package com.ejemplo.escuela.demo.pojo;

import java.util.List;
import java.util.OptionalDouble;

import com.ejemplo.escuela.demo.model.Calificacion;

/**
 * @author Admin
 *
 */
public class PromedioCalificacion {

	private List<Calificacion> materiasCalificaciones;
	private float promedio;
	
	public PromedioCalificacion(List<Calificacion> calificaciones, float promedio) {
		super();
		this.materiasCalificaciones = calificaciones;
		//this.promedio = promedio;
		OptionalDouble promedioOp = this.materiasCalificaciones.stream().mapToDouble((calificacion)->{
			return (double)calificacion.getCalificacion();
		}).average();
		
		this.promedio = (float)promedioOp.orElse(0);
	}

	public List<Calificacion> getMateriasCalificaciones() {
		return materiasCalificaciones;
	}

	public void setMateriasCalificaciones(List<Calificacion> materiasCalificaciones) {
		this.materiasCalificaciones = materiasCalificaciones;
	}

	public float getPromedio() {
		return promedio;
	}

	public void setPromedio(float promedio) {
		this.promedio = promedio;
	}

	
	

}
