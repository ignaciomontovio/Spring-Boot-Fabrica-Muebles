package com.kui.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kui.app.entity.cliente.Cliente;
import com.kui.app.entity.cliente.IClienteRepo;
@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteRepo clienteRepository;
	
	@Override
	public List<Cliente> listarTodos() {
		return clienteRepository.findAll();
	}

	@Override
	public void guardar(Cliente cliente) {
		clienteRepository.save(cliente);
	}

	@Override
	public Cliente buscarPorId(int id) {
		return clienteRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(int id) {
		clienteRepository.deleteById(id);
	}

}
