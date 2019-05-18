package com.consware.consware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.consware.consware.model.Producto;
import com.consware.consware.services.ProductoService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/productos"})
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/{nombre}")
	public  Iterable<Procucto> getCliente(@PathVariable String nombre) {
		Iterable<Procucto>cliente = productoService.buscar(nombre);
		return cliente;
	}
	
	@PutMapping
	public  Iterable<Procucto>  updateCliente(@RequestBody Cliente cliente) {
		Iterable<Procucto>  clientes = productoService.addProcucto(cliente);
		return clientes;
	}
	
    @PostMapping
    public Iterable<Procucto>  addCliente(@RequestBody Cliente cliente){
    	return productoService.addCliente(cliente);
    }
    
    @DeleteMapping
    public boolean eliminaCliente(@RequestParam Long id) {
    	return productoService.deleteCliente(id);
    }
	


}
