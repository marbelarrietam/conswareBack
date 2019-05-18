package com.consware.consware.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.consware.consware.json.viewer.JSonServiceViewer;
import com.fasterxml.jackson.annotation.JsonView;

@Entity(name="clientes")
@Table(name="clientes")
public class Cliente {
	
	
	@JsonView(JSonServiceViewer.Public.class)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@JsonView(JSonServiceViewer.Public.class)
	@Column(name="nombre")
	private String nombre;
	
	@JsonView(JSonServiceViewer.Public.class)
	@Column(name="apellido")
	private String apellido;
	
	@JsonView(JSonServiceViewer.Public.class)
	@Column(name="direccion")
	private String direccion;
	
	@JsonView(JSonServiceViewer.Public.class)
	@Column(name="email")
	private String email;
	
	@JsonView(JSonServiceViewer.Public.class)
	@Column(name="telefono")
	private String telefono;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	

}
