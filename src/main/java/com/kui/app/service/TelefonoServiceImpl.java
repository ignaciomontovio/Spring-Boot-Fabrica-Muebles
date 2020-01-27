package com.kui.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kui.app.entity.cliente.ITelefonoRepo;
import com.kui.app.entity.cliente.Telefono;

@Service
public class TelefonoServiceImpl implements ITelefonoService{

	@Autowired
	private ITelefonoRepo telefonoRepository;
	
	@Override
	public List<Telefono> listarTodos() {
		return telefonoRepository.findAll();
	}

	@Override
	public void guardar(Telefono telefono) {
		telefonoRepository.save(telefono);
		
	}

	@Override
	public Telefono buscarPorId(int numero_Telefono) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(int numero_Telefono) {
		// TODO Auto-generated method stub
		
	}

}
