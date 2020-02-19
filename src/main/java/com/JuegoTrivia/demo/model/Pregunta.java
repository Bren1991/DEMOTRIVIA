package com.JuegoTrivia.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pregunta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idpreguntas;
	
	@Column(nullable = false)
	private String descripcion;
	
	@Column(nullable = false)
	private Integer categoriasIdcategorias;
	
	public Pregunta() {
	}
	public Pregunta(Integer idpreguntas, String descripcion, Integer categoriasIdcategorias) {
		this.idpreguntas = idpreguntas;
		this.descripcion = descripcion;
		this.categoriasIdcategorias = categoriasIdcategorias;
	}
	public Integer getIdpreguntas() {
		return idpreguntas;
	}
	public void setIdpreguntas(Integer idpreguntas) {
		this.idpreguntas = idpreguntas;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getCategoriasIdcategorias() {
		return categoriasIdcategorias;
	}
	public void setCategoriasIdcategorias(Integer categoriasIdcategorias) {
		this.categoriasIdcategorias = categoriasIdcategorias;
	}
	
	
}
