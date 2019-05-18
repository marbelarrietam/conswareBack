package com.consware.consware.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.consware.consware.json.viewer.JSonServiceViewer;
import com.fasterxml.jackson.annotation.JsonView;

public class Usuario {
	
	@JsonView(JSonServiceViewer.Public.class)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@JsonView(JSonServiceViewer.Public.class)
	@Column(name="email")
	private String email;
	
	@JsonView(JSonServiceViewer.Public.class)
	@Column(name="password")
	private String password;
}
