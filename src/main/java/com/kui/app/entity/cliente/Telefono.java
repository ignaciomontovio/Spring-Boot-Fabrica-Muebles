package com.kui.app.entity.cliente;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class Telefono implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TelefonoPK id = new TelefonoPK();
	
	@ManyToOne
	@MapsId("id_Cliente")
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;

	public TelefonoPK getId() {
		return id;
	}

	public void setId(TelefonoPK id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Telefono() {
		this.cliente = new Cliente();
	}
	
	
}
