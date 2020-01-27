package com.kui.app.entity.mueble.tipoMueble;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.kui.app.entity.mueble.Mueble;

@Entity
public class Escalera implements Serializable {

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
}
