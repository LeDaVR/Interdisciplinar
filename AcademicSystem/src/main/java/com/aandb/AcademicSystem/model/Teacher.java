package com.aandb.AcademicSystem.model;

public class Teacher {
	private int id;
	private int dni;
	private String nombre;
	private String grado_academico;
	private String docentescol;
	private int id_departamento_academico;
	
	public Teacher() {
		
	}
	public Teacher(int id, int dni, String nombre, String grado_academico, String docentescol,
			int id_departemento_academico) {
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.grado_academico = grado_academico;
		this.docentescol = docentescol;
		this.id_departamento_academico = id_departemento_academico;
	}
	
	public Teacher(int id, int dni, String nombre, String grado_academico,
			int id_departemento_academico) {
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.grado_academico = grado_academico;
		this.id_departamento_academico = id_departemento_academico;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGrado_academico() {
		return grado_academico;
	}

	public void setGrado_academico(String grado_academico) {
		this.grado_academico = grado_academico;
	}

	public String getDocentescol() {
		return docentescol;
	}

	public void setDocentescol(String docentescol) {
		this.docentescol = docentescol;
	}

	public int getId_departamento_academico() {
		return id_departamento_academico;
	}

	public void setId_departamento_academico(int id_departemento_academico) {
		this.id_departamento_academico = id_departemento_academico;
	}
	
	
}
