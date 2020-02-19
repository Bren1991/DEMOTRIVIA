package com.JuegoTrivia.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.crypto.Data;

@Entity 
@Table (name="usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idusuarios;
	
	@Column(nullable = false, unique = true)
	private String usuario;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false)
	private String pais;
	
	@Column(nullable = false)
	private Date fechaDeNacimiento;
	
	@Column(nullable = false)
	private Integer puntos;
	
	@Column(nullable = false)
	private Integer avatar;
	
	/**Agrego la tabla para sexo*/
	@Column(nullable = false)
	private String sexo;
	
	public Usuario() {
	}

	public Usuario(Integer idusuarios, String usuario, String password, String email, String pais,
			Date fechaDeNacimiento, Integer puntos, Integer avatar) {
		this.idusuarios = idusuarios;
		this.usuario = usuario;
		this.password = password;
		this.email = email;
		this.pais = pais;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.puntos = puntos;
		this.avatar = avatar;
	}

	public Integer getIdusuarios() {
		return idusuarios;
	}
	public void setIdusuarios(Integer idusuarios) {
		this.idusuarios = idusuarios;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public Integer getPuntos() {
		return puntos;
	}
	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}
	public Integer getAvatar() {
		return avatar;
	}
	public void setAvatar(Integer avatar) {
		this.avatar = avatar;
	}
	
	
}
