package com.kui.app.service;

import java.util.List;
import com.kui.app.entity.cliente.Telefono;

public interface ITelefonoService {
	public List<Telefono> listarTodos();
	public void guardar(Telefono telefono);
	public Telefono buscarPorId(int numero_Telefono);
	public void eliminar(int numero_Telefono);
}
