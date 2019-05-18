package com.consware.consware.model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface ProductoRepositorio extends PagingAndSortingRepository<Producto, Long>{
	
    @Query("FROM productos where nombre like :nombre")
    public Iterable<Producto>  getById(@Param ("nombre") String nombre);
    
}