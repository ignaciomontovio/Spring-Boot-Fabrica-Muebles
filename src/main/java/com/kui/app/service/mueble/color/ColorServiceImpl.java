package com.kui.app.service.mueble.color;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kui.app.entity.mueble.color.Color;
import com.kui.app.entity.mueble.color.IColorRepo;

@Service
public class ColorServiceImpl implements IColorService{

	@Autowired
	private IColorRepo colorRepository;
	
	@Override
	public List<Color> listarTodos() {
		return colorRepository.findAll();
	}

	@Override
	public void guardar(Color color) {
		colorRepository.save(color);
	}

	@Override
	public Color buscarPorId(String nombre_color) {
		return colorRepository.findById(nombre_color).orElse(null);
	}

	@Override
	public void eliminar(String nombre_color) {
		colorRepository.deleteById(nombre_color);
		
	}

	
}
