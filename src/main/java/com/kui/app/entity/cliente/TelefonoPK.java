package com.kui.app.entity.cliente;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class TelefonoPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id_Cliente;
	private Integer numero_Telefono;
	
	
	
	public Integer getId_Cliente() {
		return id_Cliente;
	}
	public void setId_Cliente(Integer id_Cliente) {
		this.id_Cliente = id_Cliente;
	}
	public Integer getNumero_Telefono() {
		return numero_Telefono;
	}
	public void setNumero_Telefono(Integer numero_Telefono) {
		this.numero_Telefono = numero_Telefono;
	}
	
	

}
