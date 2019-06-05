package com.Interdisciplinar.sistemaacademico.model;

public class Competencias {
	private int fk_silabo;
	private int fk_resultado;
	private String descripcion;
	
	
	public Competencias(int fk_silabo, int fk_resultado, String descripcion) {
		this.fk_silabo = fk_silabo;
		this.fk_resultado = fk_resultado;
		this.descripcion = descripcion;
	}


	public int getFk_silabo() {
		return fk_silabo;
	}


	public void setFk_silabo(int fk_silabo) {
		this.fk_silabo = fk_silabo;
	}


	public int getFk_resultado() {
		return fk_resultado;
	}


	public void setFk_resultado(int fk_resultado) {
		this.fk_resultado = fk_resultado;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	
}
