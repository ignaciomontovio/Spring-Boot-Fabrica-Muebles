package com.kui.app.service.codigoDeBarras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kui.app.entity.codigoDeBarras.CodigoDeBarras;
import com.kui.app.entity.codigoDeBarras.ICodigoDeBarrasRepo;

@Service
public class CodigoDeBarrasServiceImpl implements ICodigoDeBarrasService{

	@Autowired
	private ICodigoDeBarrasRepo codigoDeBarrasRepository;

	@Override
	public List<CodigoDeBarras> listarTodos() {
		return codigoDeBarrasRepository.findAll();
	}

	@Override
	public void guardar(CodigoDeBarras codigoDeBarras) {
		codigoDeBarrasRepository.save(codigoDeBarras);
	}
}
