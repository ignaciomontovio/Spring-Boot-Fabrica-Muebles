package com.kui.app;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


public class VentaMuebleYCodigoDeBarras {
	
	private Integer id_Venta;
	private Integer id_Mueble;
	private Integer numeroCodigoDeBarras;
	
	public VentaMuebleYCodigoDeBarras() {
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

	public Integer getNumeroCodigoDeBarras() {
		return numeroCodigoDeBarras;
	}

	public void setNumeroCodigoDeBarras(Integer numeroCodigoDeBarras) {
		this.numeroCodigoDeBarras = numeroCodigoDeBarras;
	}

	@Override
	public String toString() {
		return "VentaMuebleYCodigoDeBarras [id_Venta=" + id_Venta + ", id_Mueble=" + id_Mueble
				+ ", numeroCodigoDeBarras=" + numeroCodigoDeBarras + "]";
	}
	
	
}
