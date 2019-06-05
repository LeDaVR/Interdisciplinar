package com.Interdisciplinar.sistemaacademico.model;

public class Prerequisitos {
	private int fk_cuso;
	private int fk_prerequisitos;
	
	public Prerequisitos(int fk_cuso, int fk_prerequisitos) {
		this.fk_cuso = fk_cuso;
		this.fk_prerequisitos = fk_prerequisitos;
	}

	public int getFk_cuso() {
		return fk_cuso;
	}

	public void setFk_cuso(int fk_cuso) {
		this.fk_cuso = fk_cuso;
	}

	public int getFk_prerequisitos() {
		return fk_prerequisitos;
	}

	public void setFk_prerequisitos(int fk_prerequisitos) {
		this.fk_prerequisitos = fk_prerequisitos;
	}
	
	
	
}
