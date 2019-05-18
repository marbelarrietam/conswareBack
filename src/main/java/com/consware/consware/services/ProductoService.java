package com.consware.consware.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.consware.consware.model.Producto;
import com.consware.consware.model.ProductoRepositorio;

public class ProductoService {

	@Autowired
	private ProductoRepositorio productoRepositorio;
	
	
	public Iterable<Producto>  buscar(String nombre) {
		Iterable<Producto> productos = productoRepositorio.getById(nombre);
		return productos;
	}
	
	public Iterable<Producto>addCliente(Producto producto) {
		productoRepositorio.save(producto);
		Iterable<Producto> clientes = productoRepositorio.findAll();
		return clientes;
	}
	
	
}
