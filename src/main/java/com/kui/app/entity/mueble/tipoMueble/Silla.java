
package com.kui.app.entity.mueble.tipoMueble;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.kui.app.entity.mueble.Mueble;
import com.kui.app.entity.mueble.color.Color;
import com.kui.app.entity.mueble.talle.Talle;

@Entity
public class Silla implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "id_mueble",referencedColumnName = "id_Mueble")
	@MapsId
	private Mueble mueble; 
	
	@ManyToOne
	@JoinColumn(name = "nombre_color",referencedColumnName = "nombre_color")
	private Color color;
	
	@ManyToOne
	@JoinColumn(name = "numero_talle",referencedColumnName = "numero_talle")
	private Talle talle;
	
}
