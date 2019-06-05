package com.Interdisciplinar.sistemaacademico.model;

public class Asistencia_Alumno {
	private int fk_cui;
	private int fk_asistencia;
	private String asistio;
	public Asistencia_Alumno(int fk_cui, int fk_asistencia, String asistio) {
		this.fk_cui = fk_cui;
		this.fk_asistencia = fk_asistencia;
		this.asistio = asistio;
	}
	public int getFk_cui() {
		return fk_cui;
	}
	public void setFk_cui(int fk_cui) {
		this.fk_cui = fk_cui;
	}
	public int getFk_asistencia() {
		return fk_asistencia;
	}
	public void setFk_asistencia(int fk_asistencia) {
		this.fk_asistencia = fk_asistencia;
	}
	public String getAsistio() {
		return asistio;
	}
	public void setAsistio(String asistio) {
		this.asistio = asistio;
	}
	
	
	
}
