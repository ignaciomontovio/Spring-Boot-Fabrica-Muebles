package com.kui.app.entity.cliente;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.UniqueConstraint;

import com.kui.app.entity.mueble.Mueble;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_cliente")
	private int id_Cliente;

	@Column(name = "nombre_cliente", length = 50)
	private String nombre_Cliente;

	@Column(name = "dni")
	private int dni;

	@Column(name = "direccion", length = 50)
	private String direccion;

	@Column(name = "email", length = 50)
	private String email;

	@Column(name = "red_contacto")
	private String red_Contacto;

	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Telefono> telefonos;

	public List<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public int getId_Cliente() {
		return id_Cliente;
	}

	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
	}

	public String getNombre_Cliente() {
		return nombre_Cliente;
	}

	public void setNombre_Cliente(String nombre_Cliente) {
		this.nombre_Cliente = nombre_Cliente;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRed_Contacto() {
		return red_Contacto;
	}

	public void setRed_Contacto(String red_Contacto) {
		this.red_Contacto = red_Contacto;
	}

	@Override
	public String toString() {
		return "Cliente [id_Cliente=" + id_Cliente + ", nombre_Cliente=" + nombre_Cliente + ", dni=" + dni
				+ ", direccion=" + direccion + ", email=" + email + ", red_Contacto=" + red_Contacto + ", telefonos="
				+ telefonos + "]";
	}

	public Cliente(int id_Cliente, String nombre_Cliente, int dni, String direccion, String email, String red_Contacto,
			List<Telefono> telefonos) {
		super();
		this.id_Cliente = id_Cliente;
		this.nombre_Cliente = nombre_Cliente;
		this.dni = dni;
		this.direccion = direccion;
		this.email = email;
		this.red_Contacto = red_Contacto;
		this.telefonos = telefonos;
	}

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

}
