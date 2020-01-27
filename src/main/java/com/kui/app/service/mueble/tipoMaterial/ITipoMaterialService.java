package com.kui.app.service.mueble.tipoMaterial;

import java.util.List;

import com.kui.app.entity.mueble.tipoMaterial.TipoMaterial;

public interface ITipoMaterialService {

	public List<TipoMaterial> listarTodos();
	public void guardar(TipoMaterial tipoMaterial);
	public TipoMaterial buscarPorId(String tipo_Material);
	public void eliminar(String tipo_Material);
}
