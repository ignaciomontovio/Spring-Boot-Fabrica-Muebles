package com.kui.app.entity.mueble;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.kui.app.entity.mueble.tipoMueble.Alfombra;
import com.kui.app.entity.mueble.tipoMueble.Baul;

@Entity
public class Mueble {

	@Id
	@Column(name = "id_mueble", length = 50)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_Mueble;

	@Column(name = "nombre_mueble", length = 50)
	private String nombre_Mueble;

	@OneToOne(mappedBy = "mueble")
	private Alfombra alfombra;
	
	@OneToOne(mappedBy = "mueble")
	private Baul baul;
	
	
	
	public Baul getBaul() {
		return baul;
	}

	public void setBaul(Baul baul) {
		this.baul = baul;
	}

	public String getNombre_Mueble() {
		return nombre_Mueble;
	}

	public void setNombre_Mueble(String nombre_Mueble) {
		this.nombre_Mueble = nombre_Mueble;
	}

	@Override
	public String toString() {
		return "Mueble [id_Mueble=" + id_Mueble + ", nombre_Mueble=" + nombre_Mueble + "]";
	}

	public Alfombra getAlfombra() {
		return alfombra;
	}

	public void setAlfombra(Alfombra alfombra) {
		this.alfombra = alfombra;
	}

	public Mueble() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mueble(int id_Mueble, String nombre_Mueble) {
		super();
		this.id_Mueble = id_Mueble;
		this.nombre_Mueble = nombre_Mueble;
	}
	
	public Mueble(int id_Mueble) {
		super();
		this.id_Mueble = id_Mueble;
	}

	public int getId_Mueble() {
		return id_Mueble;
	}

	public void setId_Mueble(int id_Mueble) {
		this.id_Mueble = id_Mueble;
	}

}
