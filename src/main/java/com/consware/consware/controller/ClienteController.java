package com.consware.consware.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.consware.consware.json.viewer.JSonServiceViewer;
import com.consware.consware.model.Cliente;
import com.consware.consware.model.ClienteRepositorio;
import com.consware.consware.services.ClienteService;
import com.fasterxml.jackson.annotation.JsonView;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/clientes"})
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/{nombre}")
	public  Iterable<Cliente> getCliente(@PathVariable String nombre) {
		Iterable<Cliente>cliente = clienteService.buscar(nombre);
		return cliente;
	}
	
	@PutMapping
	public  Iterable<Cliente>  updateCliente(@RequestBody Cliente cliente) {
		Iterable<Cliente>  clientes = clienteService.addCliente(cliente);
		return clientes;
	}
	
    @PostMapping
    public Iterable<Cliente>  addCliente(@RequestBody Cliente cliente){
    	return clienteService.addCliente(cliente);
    }
    
    @DeleteMapping
    public boolean eliminaCliente(@RequestParam Long id) {
    	return clienteService.deleteCliente(id);
    }
	

}
