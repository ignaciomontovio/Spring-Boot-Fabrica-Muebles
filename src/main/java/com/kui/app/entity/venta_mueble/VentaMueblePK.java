package com.kui.app.entity.venta_mueble;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class VentaMueblePK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id_Venta;
	private Integer id_Mueble;

	public VentaMueblePK(int id_Venta, int id_Mueble) {
		super();
		this.id_Venta = id_Venta;
		this.id_Mueble = id_Mueble;
	}

	public VentaMueblePK() {
	}

	public Integer getId_Venta() {
		return id_Venta;
	}

	public void setId_Venta(Integer id_Venta) {
		this.id_Venta = id_Venta;
	}

	public Integer getId_Mueble() {
		return id_Mueble;
	}

	public void setId_Mueble(Integer id_Mueble) {
		this.id_Mueble = id_Mueble;
	}

	@Override
	public String toString() {
		return "VentaMueblePK [id_Venta=" + id_Venta + ", id_Mueble=" + id_Mueble + "]";
	}


}
