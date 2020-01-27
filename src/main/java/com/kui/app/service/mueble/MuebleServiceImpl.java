package com.kui.app.service.mueble;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kui.app.entity.mueble.IMuebleRepo;
import com.kui.app.entity.mueble.Mueble;

@Service
public class MuebleServiceImpl implements IMuebleService{

	@Autowired
	IMuebleRepo muebleRepository;
	
	@Override
	public List<Mueble> listarTodos() {
		return muebleRepository.findAll();
	}

	@Override
	public void guardar(Mueble mueble) {
		muebleRepository.save(mueble);
	}

	@Override
	public Mueble buscarPorId(int id_Mueble) {
		return muebleRepository.findById(id_Mueble).orElse(null);
	}

	@Override
	public void eliminar(int id_Mueble) {
		muebleRepository.deleteById(id_Mueble);
	}

}
