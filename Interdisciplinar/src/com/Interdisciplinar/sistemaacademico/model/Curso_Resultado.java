package com.Interdisciplinar.sistemaacademico.model;

public class Curso_Resultado {
	private int fk_curso;
	private int fk_resultado;
	private int nivel;
	
	
	public Curso_Resultado(int fk_curso, int fk_resultado, int nivel) {
		this.fk_curso = fk_curso;
		this.fk_resultado = fk_resultado;
		this.nivel = nivel;
	}


	public int getFk_curso() {
		return fk_curso;
	}


	public void setFk_curso(int fk_curso) {
		this.fk_curso = fk_curso;
	}


	public int getFk_resultado() {
		return fk_resultado;
	}


	public void setFk_resultado(int fk_resultado) {
		this.fk_resultado = fk_resultado;
	}


	public int getNivel() {
		return nivel;
	}


	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	
	
}
