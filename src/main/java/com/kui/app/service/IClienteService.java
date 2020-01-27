package com.kui.app.service;

import java.util.List;

import com.kui.app.entity.cliente.Cliente;

public interface IClienteService {
	public List<Cliente> listarTodos();
	public void guardar(Cliente cliente);
	public Cliente buscarPorId(int id);
	public void eliminar(int id);
}
