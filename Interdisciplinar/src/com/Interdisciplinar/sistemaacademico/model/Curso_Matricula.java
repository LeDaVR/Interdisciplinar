package com.Interdisciplinar.sistemaacademico.model;

public class Curso_Matricula {
	private int fk_matricula;
	private int fk_curso;
	
	
	public Curso_Matricula(int fk_matricula, int fk_curso) {
		super();
		this.fk_matricula = fk_matricula;
		this.fk_curso = fk_curso;
	}


	public int getFk_matricula() {
		return fk_matricula;
	}


	public void setFk_matricula(int fk_matricula) {
		this.fk_matricula = fk_matricula;
	}


	public int getFk_curso() {
		return fk_curso;
	}


	public void setFk_curso(int fk_curso) {
		this.fk_curso = fk_curso;
	}
	
	
	
}
