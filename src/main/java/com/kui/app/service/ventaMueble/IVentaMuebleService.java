package com.kui.app.service.ventaMueble;

import java.util.List;

import com.kui.app.entity.venta_mueble.VentaMueble;

public interface IVentaMuebleService {
	public List<VentaMueble> listarTodos();
	public void guardar(VentaMueble ventaMueble);
	public List<VentaMueble> buscarPorId(Integer id_Venta,Integer id_Mueble);
}
