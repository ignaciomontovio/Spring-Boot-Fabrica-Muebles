package com.kui.app.entity.mueble.color;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Color {

	public String getNombre_Color() {
		return nombre_Color;
	}

	public void setNombre_Color(String nombre_Color) {
		this.nombre_Color = nombre_Color;
	}

	@Id
	@Column(name = "nombre_color",length = 50)
	private String nombre_Color;

	@Override
	public String toString() {
		return "Color [nombre_Color=" + nombre_Color + "]";
	}
	
}
