package com.kui.app.entity.mueble.talle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Talle {

	@Id
	@Column(name = "numero_talle")
	private int numero_Talle;

	public int getNumero_Talle() {
		return numero_Talle;
	}

	public void setNumero_Talle(int numero_Talle) {
		this.numero_Talle = numero_Talle;
	}
}
