package com.kui.app.service.codigoDeBarras;

import java.util.List;

import com.kui.app.entity.codigoDeBarras.CodigoDeBarras;

public interface ICodigoDeBarrasService {

	public List<CodigoDeBarras> listarTodos();
	public void guardar(CodigoDeBarras codigoDeBarras);
}