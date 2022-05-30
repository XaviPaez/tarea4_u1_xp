package com.uce.edu.demo.matricula;

import java.time.LocalDateTime;

public class Estudiante {
	private String nombre;
	private String apellido;
	private LocalDateTime fechaNacimiento;

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

	// GET Y SET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}


