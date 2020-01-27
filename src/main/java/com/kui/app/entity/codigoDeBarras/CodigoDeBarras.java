package com.kui.app.entity.codigoDeBarras;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.kui.app.entity.mueble.Mueble;
import com.kui.app.entity.venta_mueble.VentaMueble;

@Entity
public class CodigoDeBarras {

	@Id
	@Column(name = "numerocodigodebarras")
	private Integer numeroCodigoDeBarras;
	
	@ManyToOne
	@JoinColumn(name = "id_mueble",referencedColumnName = "id_Mueble")
	private Mueble mueble;

	@ManyToOne
	@JoinColumn(name="id_ventamueble_venta", referencedColumnName="id_Venta")
    @JoinColumn(name="id_ventamueble_mueble", referencedColumnName="id_Mueble")
	private VentaMueble ventaMueble;
	
	public CodigoDeBarras() {
		this.mueble = new Mueble();
		this.numeroCodigoDeBarras = 99;
	}

	public Integer getNumeroCodigoDeBarras() {
		return numeroCodigoDeBarras;
	}
	
	public void setNumeroCodigoDeBarras(Integer numeroCodigoDeBarras) {
		this.numeroCodigoDeBarras = numeroCodigoDeBarras;
	}

	public Mueble getMueble() {
		return mueble;
	}

	public void setMueble(Mueble mueble) {
		this.mueble = mueble;
	}

	public CodigoDeBarras(Integer numeroCodigoDeBarras) {
		super();
		this.numeroCodigoDeBarras = numeroCodigoDeBarras;
		this.mueble = new Mueble();
	}

	public CodigoDeBarras(Integer numeroCodigoDeBarras, Mueble mueble, VentaMueble ventaMueble) {
		super();
		this.numeroCodigoDeBarras = numeroCodigoDeBarras;
		this.mueble = mueble;
		this.ventaMueble = ventaMueble;
	}

	@Override
	public String toString() {
		return "CodigoDeBarras [numeroCodigoDeBarras=" + numeroCodigoDeBarras + "]";
	}
	
	
}
