package com.kui.app.service.ventaMueble;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kui.app.entity.venta.IVentaRepo;
import com.kui.app.entity.venta_mueble.IVentaMuebleRepo;
import com.kui.app.entity.venta_mueble.VentaMueble;
import com.kui.app.entity.venta_mueble.VentaMueblePK;

@Service
public class VentaMuebleServiceImpl implements IVentaMuebleService{

	@Autowired
	private IVentaMuebleRepo ventaMuebleRepository;
	
	@Override
	public List<VentaMueble> listarTodos() {
		return ventaMuebleRepository.findAll();
	}

	@Override
	public void guardar(VentaMueble ventaMueble) {
		ventaMuebleRepository.save(ventaMueble);
	}

	@Override
	public List<VentaMueble> buscarPorId(Integer id_Venta,Integer id_Mueble) {
		return ventaMuebleRepository.findByid(new VentaMueblePK(id_Venta,id_Mueble));
	}

}
