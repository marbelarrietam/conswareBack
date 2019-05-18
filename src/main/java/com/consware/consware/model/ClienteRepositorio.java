package com.consware.consware.model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.consware.consware.model.Cliente;

public interface ClienteRepositorio extends PagingAndSortingRepository<Cliente, Long>{
	
     @Query("FROM clientes where nombre like :nombre")
     public Iterable<Cliente>  getById(@Param ("nombre") String nombre);
}