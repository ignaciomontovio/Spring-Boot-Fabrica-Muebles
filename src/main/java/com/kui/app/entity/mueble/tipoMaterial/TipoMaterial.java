package com.kui.app.entity.mueble.tipoMaterial;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TipoMaterial{

	@Id
	@Column(name = "tipo_material",length = 50)
	private String tipo_Material;

	public String getTipo_Material() {
		return tipo_Material;
	}

	public void setTipo_Material(String tipo_Material) {
		this.tipo_Material = tipo_Material;
	}
	
}
