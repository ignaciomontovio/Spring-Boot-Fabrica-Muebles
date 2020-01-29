package com.kui.app.entity.venta_mueble;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;

import com.kui.app.entity.codigoDeBarras.CodigoDeBarras;
import com.kui.app.entity.mueble.Mueble;
import com.kui.app.entity.venta.Venta;

@Entity
public class VentaMueble {

	@EmbeddedId
	private VentaMueblePK id = new VentaMueblePK();

	@ManyToOne
	@MapsId("id_Mueble")
	@JoinColumn(name = "id_mueble")
	private Mueble mueble;

	@ManyToOne
	@MapsId("id_Venta")
	@JoinColumn(name = "id_venta")
	private Venta venta;

	@OneToMany(mappedBy = "ventaMueble")
	private Set<CodigoDeBarras> codigosDeBarras = new HashSet<>();

	private int cantidad;

	public Set<CodigoDeBarras> getCodigosDeBarras() {
		return codigosDeBarras;
	}

	public void setCodigosDeBarras(Set<CodigoDeBarras> codigosDeBarras) {
		this.codigosDeBarras = codigosDeBarras;
	}

	public void agregarCodigoDeBarras(CodigoDeBarras codigo) {
		this.codigosDeBarras.add(codigo);
	}

	public VentaMueblePK getId() {
		return id;
	}

	public void setId(VentaMueblePK id) {
		this.id = id;
	}

	public Mueble getMueble() {
		return mueble;
	}

	public void setMueble(Mueble mueble) {
		this.mueble = mueble;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public VentaMueble() {
		this.id = new VentaMueblePK();
		this.mueble = new Mueble();
		this.venta = new Venta();
	}

	public VentaMueble(Mueble mueble, Venta venta) {
		super();
		this.id = new VentaMueblePK(venta.getId_Venta(), mueble.getId_Mueble());
		this.mueble = mueble;
		this.venta = venta;
	}

	@Override
	public String toString() {
		return "VentaMueble [id=" + id + ", mueble=" + mueble + ", venta=" + venta + ", codigosDeBarras="
				+ codigosDeBarras + ", cantidad=" + cantidad + "]";
	}



}
