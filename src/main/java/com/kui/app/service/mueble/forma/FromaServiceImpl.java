package com.kui.app.service.mueble.forma;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kui.app.entity.mueble.forma.Forma;
import com.kui.app.entity.mueble.forma.IFormaRepo;

@Service
public class FromaServiceImpl implements IFormaService{

	@Autowired
	IFormaRepo formaRepository;
	
	@Override
	public List<Forma> listarTodos() {
		return formaRepository.findAll();
	}

	@Override
	public void guardar(Forma forma) {
		formaRepository.save(forma);
		
	}

	@Override
	public Forma buscarPorId(String nombre_Forma) {
		return formaRepository.findById(nombre_Forma).orElse(null);
	}

	@Override
	public void eliminar(String nombre_Forma) {
		formaRepository.deleteById(nombre_Forma);
	}

}
