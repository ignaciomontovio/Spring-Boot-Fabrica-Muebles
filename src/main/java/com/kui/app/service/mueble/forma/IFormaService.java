package com.kui.app.service.mueble.forma;

import java.util.List;

import com.kui.app.entity.mueble.forma.Forma;

public interface IFormaService {
	public List<Forma> listarTodos();
	public void guardar(Forma forma);
	public Forma buscarPorId(String nombre_Forma);
	public void eliminar(String nombre_Forma);
}
