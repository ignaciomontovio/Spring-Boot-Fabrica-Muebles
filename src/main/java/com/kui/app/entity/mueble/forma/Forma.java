package com.kui.app.entity.mueble.forma;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Forma {

	public String getNombre_Forma() {
		return nombre_Forma;
	}

	public void setNombre_Forma(String nombre_Forma) {
		this.nombre_Forma = nombre_Forma;
	}

	@Id
	@Column(name = "nombre_forma",length = 50)
	private String nombre_Forma;
}
