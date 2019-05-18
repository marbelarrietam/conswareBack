package com.consware.consware.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consware.consware.model.Cliente;
import com.consware.consware.model.ClienteRepositorio;


@Service
public class ClienteService {
	
	
	@Autowired
	private ClienteRepositorio clienteRepositorio;
	
	
	public Iterable<Cliente>  buscar(String nombre) {
		Iterable<Cliente> clientes = clienteRepositorio.getById(nombre);
		return clientes;
	}
	
	public Iterable<Cliente>addCliente(Cliente cliente) {
		clienteRepositorio.save(cliente);
		Iterable<Cliente> clientes = clienteRepositorio.findAll();
		return clientes;
	}
	
	
}

