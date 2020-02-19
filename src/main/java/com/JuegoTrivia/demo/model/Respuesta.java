package com.JuegoTrivia.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Respuesta {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idrespuestas;
	
	@Column(nullable = false)
	private String descripcionRespuesta;
	
	public Respuesta() {
	}
	public Respuesta(Integer idrespuestas, String descripcionRespuesta) {
		this.idrespuestas = idrespuestas;
		this.descripcionRespuesta = descripcionRespuesta;
	}
	public Integer getIdrespuestas() {
		return idrespuestas;
	}
	public void setIdrespuestas(Integer idrespuestas) {
		this.idrespuestas = idrespuestas;
	}
	public String getDescripcionRespuesta() {
		return descripcionRespuesta;
	}
	public void setDescripcionRespuesta(String descripcionRespuesta) {
		this.descripcionRespuesta = descripcionRespuesta;
	}
	
}
