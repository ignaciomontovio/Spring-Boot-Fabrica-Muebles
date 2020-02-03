package com.kui.app.service.venta;

import java.util.List;

import com.kui.app.entity.cliente.Cliente;
import com.kui.app.entity.venta.Venta;

public interface IVentaService {
	void guardar(Venta venta);
	public List<Venta> listarTodos();
	public Venta buscarPorId(Integer id_Venta);
	public void eliminarPorId(Integer id_Venta);
}
