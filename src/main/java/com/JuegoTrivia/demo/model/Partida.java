package com.JuegoTrivia.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Partida {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idpartidas;
	
	@Column (nullable=false)
	private Integer ganadorIdusuario;
	
	@Column(nullable=false)
	private Integer fecha;
	
	@Column(nullable=false)
	private Integer usuariosIdusuarios;
	
	public Partida() {
	}
	public Partida(Integer idpartidas, Integer ganadorIdusuario, Integer fecha, Integer usuariosIdusuarios) {
		this.idpartidas = idpartidas;
		this.ganadorIdusuario = ganadorIdusuario;
		this.fecha = fecha;
		this.usuariosIdusuarios = usuariosIdusuarios;
	}
	public Integer getIdpartidas() {
		return idpartidas;
	}
	public void setIdpartidas(Integer idpartidas) {
		this.idpartidas = idpartidas;
	}
	public Integer getGanadorIdusuario() {
		return ganadorIdusuario;
	}
	public void setGanadorIdusuario(Integer ganadorIdusuario) {
		this.ganadorIdusuario = ganadorIdusuario;
	}
	public Integer getFecha() {
		return fecha;
	}
	public void setFecha(Integer fecha) {
		this.fecha = fecha;
	}
	public Integer getUsuariosIdusuarios() {
		return usuariosIdusuarios;
	}
	public void setUsuariosIdusuarios(Integer usuariosIdusuarios) {
		this.usuariosIdusuarios = usuariosIdusuarios;
	}
	
	
}
