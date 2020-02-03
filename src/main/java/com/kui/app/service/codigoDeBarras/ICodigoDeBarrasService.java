package com.kui.app.service.codigoDeBarras;

import java.util.List;

import com.kui.app.entity.codigoDeBarras.CodigoDeBarras;

public interface ICodigoDeBarrasService {

	public List<CodigoDeBarras> listarTodos();
	public void guardar(CodigoDeBarras codigoDeBarras);
	public CodigoDeBarras buscarPorId(Integer numeroCodigoDeBarras);
	public void eliminarPorId(Integer numeroCodigoDeBarras);
}
