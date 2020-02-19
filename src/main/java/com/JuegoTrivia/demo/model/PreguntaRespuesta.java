package com.JuegoTrivia.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pregunta_respuesta")
public class PreguntaRespuesta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idpreguntaRespuesta;
	
	@Column(nullable=false)
	private Boolean correcta;
	
	@Column(nullable=false)
	private Integer preguntasIdpreguntas;
	
	@Column(nullable=false)
	private Integer respuestasIdrespuestas;

	@Column(nullable=false)
	public Integer getIdpreguntaRespuesta() {
		return idpreguntaRespuesta;
	}
	public PreguntaRespuesta() {
	}
	public PreguntaRespuesta(Integer idpreguntaRespuesta, Boolean correcta, Integer preguntasIdpreguntas,
			Integer respuestasIdrespuestas) {
		this.idpreguntaRespuesta = idpreguntaRespuesta;
		this.correcta = correcta;
		this.preguntasIdpreguntas = preguntasIdpreguntas;
		this.respuestasIdrespuestas = respuestasIdrespuestas;
	}

	public void setIdpreguntaRespuesta(Integer idpreguntaRespuesta) {
		this.idpreguntaRespuesta = idpreguntaRespuesta;
	}


	public Boolean getCorrecta() {
		return correcta;
	}


	public void setCorrecta(Boolean correcta) {
		this.correcta = correcta;
	}


	public Integer getPreguntasIdpreguntas() {
		return preguntasIdpreguntas;
	}


	public void setPreguntasIdpreguntas(Integer preguntasIdpreguntas) {
		this.preguntasIdpreguntas = preguntasIdpreguntas;
	}


	public Integer getRespuestasIdrespuestas() {
		return respuestasIdrespuestas;
	}


	public void setRespuestasIdrespuestas(Integer respuestasIdrespuestas) {
		this.respuestasIdrespuestas = respuestasIdrespuestas;
	}
	
	
}
