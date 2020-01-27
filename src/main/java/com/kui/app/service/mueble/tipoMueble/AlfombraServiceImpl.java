package com.kui.app.service.mueble.tipoMueble;

import java.util.List;

import javax.management.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kui.app.entity.mueble.color.IColorRepo;
import com.kui.app.entity.mueble.tipoMueble.Alfombra;
import com.kui.app.entity.mueble.tipoMueble.IAlfombraRepo;

@Service
public class AlfombraServiceImpl implements IAlfombraService{

	@Autowired
	private IAlfombraRepo alfombraRepository;
	
	@Override
	public void guardar(Alfombra alfombra) {
		alfombraRepository.save(alfombra);
	}

	@Override
	public void eliminar(int id_Mueble) {
		alfombraRepository.deleteById(id_Mueble);
	}

	@Override
	public List<Alfombra> obtenerAlfombras() {
		return alfombraRepository.findAll();
	}

	

}
