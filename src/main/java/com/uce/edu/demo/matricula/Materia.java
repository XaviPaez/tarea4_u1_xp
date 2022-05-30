package com.uce.edu.demo.matricula;

public class Materia {

	private String nombre;
	private Integer semestre;
	private String aula;


	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", semestre=" + semestre + ", aula=" + aula + "]";
	}

	// GET Y SET
	public Integer getSemestre() {
		return semestre;
	}

	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}

	public String getAula() {
		return aula;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}
