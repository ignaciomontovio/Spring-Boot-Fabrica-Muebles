package com.kui.app.service.mueble;

import java.util.List;

import com.kui.app.entity.mueble.Mueble;

public interface IMuebleService {

	public List<Mueble> listarTodos();
	public void guardar(Mueble mueble);
	public Mueble buscarPorId(int id_Mueble);
	public void eliminar(int id_Mueble);
}
