package com.Interdisciplinar.sistemaacademico.model;

public class Resultados {
	private int id_resultados;
	private String contenido;
	
	public Resultados(int id_resultados, String contenido) {
		this.id_resultados = id_resultados;
		this.contenido = contenido;
	}

	public int getId_resultados() {
		return id_resultados;
	}

	public void setId_resultados(int id_resultados) {
		this.id_resultados = id_resultados;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	
	
}
