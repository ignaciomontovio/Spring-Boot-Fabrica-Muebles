package com.kui.app.service.mueble.color;

import java.util.List;

import com.kui.app.entity.mueble.color.Color;

public interface IColorService {

	public List<Color> listarTodos();
	public void guardar(Color color);
	public Color buscarPorId(String nombre_color);
	public void eliminar(String nombre_color);
}
