package com.kui.app.service.venta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kui.app.entity.venta.IVentaRepo;
import com.kui.app.entity.venta.Venta;

@Service
public class VentaServiceImpl implements IVentaService{

	@Autowired
	private IVentaRepo ventaRepository;
	
	@Override
	public void guardar(Venta venta) {
		ventaRepository.save(venta);
	}
	
	public List<Venta> listarTodos(){
		return ventaRepository.findAll();
	}

}
