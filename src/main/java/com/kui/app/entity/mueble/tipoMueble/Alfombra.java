package com.kui.app.entity.mueble.tipoMueble;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.kui.app.entity.mueble.Mueble;
import com.kui.app.entity.mueble.color.Color;

@Entity
public class Alfombra implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_mueble", referencedColumnName = "id_Mueble")
	@MapsId
	private Mueble mueble;

	@Override
	public String toString() {
		return "Alfombra [id=" + id + ", mueble=" + mueble + ", color=" + color + "]";
	}

	@ManyToOne
	@JoinColumn(name = "nombre_color", referencedColumnName = "nombre_color")
	private Color color;

	public Alfombra() {
		this.color = new Color();
		this.mueble = new Mueble();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Mueble getMueble() {
		return mueble;
	}

	public void setMueble(Mueble mueble) {
		this.mueble = mueble;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
