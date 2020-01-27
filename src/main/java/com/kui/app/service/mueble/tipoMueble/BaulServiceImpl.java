package com.kui.app.service.mueble.tipoMueble;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kui.app.entity.mueble.tipoMueble.Baul;
import com.kui.app.entity.mueble.tipoMueble.IBaulRepo;

@Service
public class BaulServiceImpl implements IBaulService{

	@Autowired
	private IBaulRepo baulRepository;
	
	@Override
	public void guardar(Baul baul) {
		baulRepository.save(baul);
	}

	@Override
	public void eliminar(int id_Mueble) {
		baulRepository.deleteById(id_Mueble);
	}

	@Override
	public List<Baul> obtenerBaules() {
		return baulRepository.findAll();
	}

	
	

	
}
