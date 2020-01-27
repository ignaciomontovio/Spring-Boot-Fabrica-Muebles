package com.kui.app.entity.venta;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.kui.app.entity.cliente.Cliente;
import com.kui.app.entity.mueble.Mueble;
import com.kui.app.entity.venta_mueble.VentaMueble;

@Entity
public class Venta {
	@Id
	@Column(name = "id_venta")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Venta;

	@Column(name = "lugar_de_entrega", length = 50)
	private String lugar_De_Entrega;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_inicio")
	private Date fecha_Inicio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_entrega")
	private Date fecha_Entrega;

	@Column(name = "precio_total")
	private float precio_Total;

	@Column(name = "ganancia")
	private float ganancia;

	@Column(name = "metodo_envio", length = 50)
	private String metodo_Envio;

	@ManyToOne
	@JoinColumn(name = "id_cliente", referencedColumnName = "id_Cliente")
	private Cliente cliente;
	
	@OneToMany(mappedBy = "venta")
    private Set<VentaMueble> ventaMuebles = new HashSet<>();

	public Venta() {
		this.id_Venta = null;
	}
	
	public Venta(Integer id_Venta) {
		super();
		this.id_Venta = id_Venta;
	}

	public Set<VentaMueble> getVentaMuebles() {
		return ventaMuebles;
	}

	public void setVentaMuebles(Set<VentaMueble> ventaMuebles) {
		this.ventaMuebles = ventaMuebles;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Integer getId_Venta() {
		return id_Venta;
	}

	public void setId_Venta(Integer id_Venta) {
		this.id_Venta = id_Venta;
	}

	public String getLugar_De_Entrega() {
		return lugar_De_Entrega;
	}

	public void setLugar_De_Entrega(String lugar_De_Entrega) {
		this.lugar_De_Entrega = lugar_De_Entrega;
	}

	public Date getFecha_Inicio() {
		return fecha_Inicio;
	}

	public void setFecha_Inicio(Date fecha_Inicio) {
		this.fecha_Inicio = fecha_Inicio;
	}

	public Date getFecha_Entrega() {
		return fecha_Entrega;
	}

	public void setFecha_Entrega(Date fecha_Entrega) {
		this.fecha_Entrega = fecha_Entrega;
	}

	public float getPrecio_Total() {
		return precio_Total;
	}

	public void setPrecio_Total(float precio_Total) {
		this.precio_Total = precio_Total;
	}

	public float getGanancia() {
		return ganancia;
	}

	public void setGanancia(float ganancia) {
		this.ganancia = ganancia;
	}

	public String getMetodo_Envio() {
		return metodo_Envio;
	}

	public void setMetodo_Envio(String metodo_Envio) {
		this.metodo_Envio = metodo_Envio;
	}

	@Override
	public String toString() {
		return "Venta [Id_Venta=" + id_Venta + ", lugar_De_Entrega=" + lugar_De_Entrega + ", fecha_Inicio="
				+ fecha_Inicio + ", fecha_Entrega=" + fecha_Entrega + ", precio_Total=" + precio_Total + ", ganancia="
				+ ganancia + ", metodo_Envio=" + metodo_Envio + "]";
	}

}
