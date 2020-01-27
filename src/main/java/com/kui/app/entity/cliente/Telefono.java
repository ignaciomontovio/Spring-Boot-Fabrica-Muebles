package com.kui.app.entity.cliente;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Telefono implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "numero_telefono")
	private int numero_Telefono;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;

	public int getNumero_Telefono() {
		return numero_Telefono;
	}

	public void setNumero_Telefono(int numero_Telefono) {
		this.numero_Telefono = numero_Telefono;
	}

	@Override
	public String toString() {
		return "Telefono [numero_Telefono=" + numero_Telefono + "]";
	}

	public Telefono(int numero_Telefono, Cliente cliente) {
		this.numero_Telefono = numero_Telefono;
		this.cliente = cliente;
	}

	public Telefono() {
		this.cliente = new Cliente();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	

	
}
