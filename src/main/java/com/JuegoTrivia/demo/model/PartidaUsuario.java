package com.JuegoTrivia.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="partida_usuario")
public class PartidaUsuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idpartidaUsuario;
	
	@Column(nullable = false)
	private Integer usuarioIdusuario;
	
	@Column(nullable = false)
	private Integer partidaIdpartida;
	
	@Column(nullable = false)
	private Integer puntos;
	 
	public PartidaUsuario (){
		
	}
	
	public PartidaUsuario(Integer idpartidaUsuario, Integer usuarioIdusuario, Integer partidaIdpartida,
			Integer puntos) {
		this.idpartidaUsuario = idpartidaUsuario;
		this.usuarioIdusuario = usuarioIdusuario;
		this.partidaIdpartida = partidaIdpartida;
		this.puntos = puntos;
	}
	public Integer getIdpartidaUsuario() {
		return idpartidaUsuario;
	}
	public void setIdpartidaUsuario(Integer idpartidaUsuario) {
		this.idpartidaUsuario = idpartidaUsuario;
	}
	public Integer getUsuarioIdusuario() {
		return usuarioIdusuario;
	}
	public void setUsuarioIdusuario(Integer usuarioIdusuario) {
		this.usuarioIdusuario = usuarioIdusuario;
	}
	public Integer getPartidaIdpartida() {
		return partidaIdpartida;
	}
	public void setPartidaIdpartida(Integer partidaIdpartida) {
		this.partidaIdpartida = partidaIdpartida;
	}
	public Integer getPuntos() {
		return puntos;
	}
	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}
	
	
	
	
}
