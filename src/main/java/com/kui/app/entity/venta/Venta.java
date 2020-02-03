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

//	lugar_De_Entrega
//	fecha_Inicio
//	fecha_Entrega
//	precio_Total
//	ganancia
//	metodo_Envio
//	cliente
	
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((fecha_Entrega == null) ? 0 : fecha_Entrega.hashCode());
		result = prime * result + ((fecha_Inicio == null) ? 0 : fecha_Inicio.hashCode());
		result = prime * result + Float.floatToIntBits(ganancia);
		result = prime * result + ((id_Venta == null) ? 0 : id_Venta.hashCode());
		result = prime * result + ((lugar_De_Entrega == null) ? 0 : lugar_De_Entrega.hashCode());
		result = prime * result + ((metodo_Envio == null) ? 0 : metodo_Envio.hashCode());
		result = prime * result + Float.floatToIntBits(precio_Total);
		result = prime * result + ((ventaMuebles == null) ? 0 : ventaMuebles.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venta other = (Venta) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (fecha_Entrega == null) {
			if (other.fecha_Entrega != null)
				return false;
		} else if (!fecha_Entrega.equals(other.fecha_Entrega))
			return false;
		if (fecha_Inicio == null) {
			if (other.fecha_Inicio != null)
				return false;
		} else if (!fecha_Inicio.equals(other.fecha_Inicio))
			return false;
		if (Float.floatToIntBits(ganancia) != Float.floatToIntBits(other.ganancia))
			return false;
		if (id_Venta == null) {
			if (other.id_Venta != null)
				return false;
		} else if (!id_Venta.equals(other.id_Venta))
			return false;
		if (lugar_De_Entrega == null) {
			if (other.lugar_De_Entrega != null)
				return false;
		} else if (!lugar_De_Entrega.equals(other.lugar_De_Entrega))
			return false;
		if (metodo_Envio == null) {
			if (other.metodo_Envio != null)
				return false;
		} else if (!metodo_Envio.equals(other.metodo_Envio))
			return false;
		if (Float.floatToIntBits(precio_Total) != Float.floatToIntBits(other.precio_Total))
			return false;
		if (ventaMuebles == null) {
			if (other.ventaMuebles != null)
				return false;
		} else if (!ventaMuebles.equals(other.ventaMuebles))
			return false;
		return true;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
