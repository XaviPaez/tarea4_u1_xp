package com.uce.edu.demo.matricula;

import java.time.LocalDateTime;


public class Matricula {
	private Estudiante estudiante;
	private Materia materia;

	public void matricular(Integer semestre, String nombreEstudiante, String apellidoEstudiante,
			LocalDateTime fechaNacimiento, String nombreMateria, String nombreAula) {


		this.estudiante = new Estudiante();
		this.estudiante.setNombre(nombreEstudiante);
		this.estudiante.setApellido(apellidoEstudiante);
		this.estudiante.setFechaNacimiento(fechaNacimiento);

		this.materia = new Materia();
		this.materia.setNombre(nombreMateria);
		this.materia.setAula(nombreAula);
		this.materia.setSemestre(semestre);
		
		System.out.println("Insertando en la base de datos");
	}



	@Override
	public String toString() {
		return "Matricula [estudiante=" + estudiante + ", materia=" + materia + "]";
	}



	// GET Y SET
	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}


}
