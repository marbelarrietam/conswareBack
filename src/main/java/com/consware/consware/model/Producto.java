package com.consware.consware.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.consware.consware.json.viewer.JSonServiceViewer;
import com.fasterxml.jackson.annotation.JsonView;

@Entity(name="productos")
@Table(name="productos")
public class Producto {

	@JsonView(JSonServiceViewer.Public.class)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@JsonView(JSonServiceViewer.Public.class)
	@Column(name="precio")
	private Long precio;
	
	@JsonView(JSonServiceViewer.Public.class)
	@Column(name="nombre")
	private String nombre;
}
